package typings.grammarkdown.optionsMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnownOption extends js.Object {
  var aliasFor: js.UndefOr[js.Array[String]] = js.native
  var convert: js.UndefOr[js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, _]] = js.native
  var description: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var isUsage: js.UndefOr[Boolean] = js.native
  var longName: String = js.native
  var many: js.UndefOr[Boolean] = js.native
  var param: js.UndefOr[String] = js.native
  var shortName: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String | (Map[String, _])] = js.native
  var validate: js.UndefOr[
    js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, Boolean]
  ] = js.native
}

object KnownOption {
  @scala.inline
  def apply(longName: String): KnownOption = {
    val __obj = js.Dynamic.literal(longName = longName.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownOption]
  }
  @scala.inline
  implicit class KnownOptionOps[Self <: KnownOption] (val x: Self) extends AnyVal {
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
    def setLongName(value: String): Self = this.set("longName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAliasForVarargs(value: String*): Self = this.set("aliasFor", js.Array(value :_*))
    @scala.inline
    def setAliasFor(value: js.Array[String]): Self = this.set("aliasFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliasFor: Self = this.set("aliasFor", js.undefined)
    @scala.inline
    def setConvert(value: (/* key */ String, /* value */ String, /* raw */ RawArguments) => _): Self = this.set("convert", js.Any.fromFunction3(value))
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIsUsage(value: Boolean): Self = this.set("isUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsUsage: Self = this.set("isUsage", js.undefined)
    @scala.inline
    def setMany(value: Boolean): Self = this.set("many", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMany: Self = this.set("many", js.undefined)
    @scala.inline
    def setParam(value: String): Self = this.set("param", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParam: Self = this.set("param", js.undefined)
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortName: Self = this.set("shortName", js.undefined)
    @scala.inline
    def setType(value: String | (Map[String, _])): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValidate(value: (/* key */ String, /* value */ String, /* raw */ RawArguments) => Boolean): Self = this.set("validate", js.Any.fromFunction3(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

