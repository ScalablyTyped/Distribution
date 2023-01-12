package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CisBenchmark extends StObject {
  
  var profileLevel: js.UndefOr[Double] = js.undefined
  
  var severity: js.UndefOr[String] = js.undefined
}
object CisBenchmark {
  
  inline def apply(): CisBenchmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CisBenchmark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CisBenchmark] (val x: Self) extends AnyVal {
    
    inline def setProfileLevel(value: Double): Self = StObject.set(x, "profileLevel", value.asInstanceOf[js.Any])
    
    inline def setProfileLevelUndefined: Self = StObject.set(x, "profileLevel", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
