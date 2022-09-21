package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngularGenerateOptions
  extends StObject
     with GenerateOptions
     with /* key */ StringDictionary[Any]
object AngularGenerateOptions {
  
  inline def apply(name: String, `type`: String): AngularGenerateOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularGenerateOptions]
  }
}
