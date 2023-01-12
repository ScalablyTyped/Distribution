package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrafeasV1FileLocation extends StObject {
  
  /** For jars that are contained inside .war files, this filepath can indicate the path to war file combined with the path to jar file. */
  var filePath: js.UndefOr[String] = js.undefined
}
object GrafeasV1FileLocation {
  
  inline def apply(): GrafeasV1FileLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1FileLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GrafeasV1FileLocation] (val x: Self) extends AnyVal {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
  }
}
