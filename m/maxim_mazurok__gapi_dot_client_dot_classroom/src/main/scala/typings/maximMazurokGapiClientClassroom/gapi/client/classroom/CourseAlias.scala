package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CourseAlias extends StObject {
  
  /**
    * Alias string. The format of the string indicates the desired alias scoping. * `d:` indicates a domain-scoped alias. Example: `d:math_101` * `p:` indicates a project-scoped alias.
    * Example: `p:abc123` This field has a maximum length of 256 characters.
    */
  var alias: js.UndefOr[String] = js.undefined
}
object CourseAlias {
  
  inline def apply(): CourseAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CourseAlias]
  }
  
  extension [Self <: CourseAlias](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
  }
}
