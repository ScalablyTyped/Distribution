package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This represents how a particular software package may be installed on a
  * system.
  */
trait SchemaInstallation extends StObject {
  
  /**
    * Required. All of the places within the filesystem versions of this
    * package have been found.
    */
  var location: js.UndefOr[js.Array[SchemaLocation]] = js.undefined
  
  /**
    * Output only. The name of the installed package.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaInstallation {
  
  inline def apply(): SchemaInstallation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstallation]
  }
  
  extension [Self <: SchemaInstallation](x: Self) {
    
    inline def setLocation(value: js.Array[SchemaLocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: SchemaLocation*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
