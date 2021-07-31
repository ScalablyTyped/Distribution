package typings.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.minimist.mod.Opts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HydratedParseArgsOptions
  extends StObject
     with Opts {
  
  @JSName("alias")
  var alias_HydratedParseArgsOptions: StringDictionary[js.Array[String]]
  
  @JSName("boolean")
  var boolean_HydratedParseArgsOptions: js.Array[String]
  
  @JSName("default")
  var default_HydratedParseArgsOptions: StringDictionary[String | Boolean]
  
  @JSName("string")
  var string_HydratedParseArgsOptions: js.Array[String]
}
object HydratedParseArgsOptions {
  
  @scala.inline
  def apply(
    alias: StringDictionary[js.Array[String]],
    boolean: js.Array[String],
    default: StringDictionary[String | Boolean],
    string: js.Array[String]
  ): HydratedParseArgsOptions = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[HydratedParseArgsOptions]
  }
  
  @scala.inline
  implicit class HydratedParseArgsOptionsMutableBuilder[Self <: HydratedParseArgsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolean(value: js.Array[String]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanVarargs(value: String*): Self = StObject.set(x, "boolean", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: StringDictionary[String | Boolean]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: js.Array[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value :_*))
  }
}
