package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageNameList extends StObject {
  
  /** A list of package names. */
  var packageNames: js.UndefOr[js.Array[String]] = js.undefined
}
object PackageNameList {
  
  inline def apply(): PackageNameList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageNameList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageNameList] (val x: Self) extends AnyVal {
    
    inline def setPackageNames(value: js.Array[String]): Self = StObject.set(x, "packageNames", value.asInstanceOf[js.Any])
    
    inline def setPackageNamesUndefined: Self = StObject.set(x, "packageNames", js.undefined)
    
    inline def setPackageNamesVarargs(value: String*): Self = StObject.set(x, "packageNames", js.Array(value*))
  }
}
