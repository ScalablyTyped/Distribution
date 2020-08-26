package typings.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.minimist.mod.Opts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HydratedParseArgsOptions extends Opts {
  @JSName("alias")
  var alias_HydratedParseArgsOptions: StringDictionary[js.Array[String]] = js.native
  @JSName("boolean")
  var boolean_HydratedParseArgsOptions: js.Array[String] = js.native
  @JSName("default")
  var default_HydratedParseArgsOptions: StringDictionary[String | Boolean] = js.native
  @JSName("string")
  var string_HydratedParseArgsOptions: js.Array[String] = js.native
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
  implicit class HydratedParseArgsOptionsOps[Self <: HydratedParseArgsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlias(value: StringDictionary[js.Array[String]]): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setBooleanVarargs(value: String*): Self = this.set("boolean", js.Array(value :_*))
    @scala.inline
    def setBoolean(value: js.Array[String]): Self = this.set("boolean", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: StringDictionary[String | Boolean]): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringVarargs(value: String*): Self = this.set("string", js.Array(value :_*))
    @scala.inline
    def setString(value: js.Array[String]): Self = this.set("string", value.asInstanceOf[js.Any])
  }
  
}

