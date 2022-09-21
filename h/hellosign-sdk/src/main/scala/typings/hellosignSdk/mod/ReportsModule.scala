package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportsModule extends StObject {
  
  def get(options: ReportsRequestOptions): js.Promise[ReportResponse]
}
object ReportsModule {
  
  inline def apply(get: ReportsRequestOptions => js.Promise[ReportResponse]): ReportsModule = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ReportsModule]
  }
  
  extension [Self <: ReportsModule](x: Self) {
    
    inline def setGet(value: ReportsRequestOptions => js.Promise[ReportResponse]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
