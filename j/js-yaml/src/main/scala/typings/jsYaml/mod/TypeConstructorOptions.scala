package typings.jsYaml.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsYaml.jsYamlStrings.mapping
import typings.jsYaml.jsYamlStrings.scalar
import typings.jsYaml.jsYamlStrings.sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeConstructorOptions extends js.Object {
  var construct: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  var defaultStyle: js.UndefOr[String] = js.native
  var instanceOf: js.UndefOr[js.Object] = js.native
  var kind: js.UndefOr[sequence | scalar | mapping] = js.native
  var predicate: js.UndefOr[js.Function1[/* data */ js.Object, Boolean]] = js.native
  var represent: js.UndefOr[
    (js.Function1[/* data */ js.Object, _]) | (StringDictionary[js.Function1[/* data */ js.Object, _]])
  ] = js.native
  var resolve: js.UndefOr[js.Function1[/* data */ js.Any, Boolean]] = js.native
  var styleAliases: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object TypeConstructorOptions {
  @scala.inline
  def apply(): TypeConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeConstructorOptions]
  }
  @scala.inline
  implicit class TypeConstructorOptionsOps[Self <: TypeConstructorOptions] (val x: Self) extends AnyVal {
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
    def setConstruct(value: /* data */ js.Any => _): Self = this.set("construct", js.Any.fromFunction1(value))
    @scala.inline
    def deleteConstruct: Self = this.set("construct", js.undefined)
    @scala.inline
    def setDefaultStyle(value: String): Self = this.set("defaultStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultStyle: Self = this.set("defaultStyle", js.undefined)
    @scala.inline
    def setInstanceOf(value: js.Object): Self = this.set("instanceOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceOf: Self = this.set("instanceOf", js.undefined)
    @scala.inline
    def setKind(value: sequence | scalar | mapping): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPredicate(value: /* data */ js.Object => Boolean): Self = this.set("predicate", js.Any.fromFunction1(value))
    @scala.inline
    def deletePredicate: Self = this.set("predicate", js.undefined)
    @scala.inline
    def setRepresentFunction1(value: /* data */ js.Object => _): Self = this.set("represent", js.Any.fromFunction1(value))
    @scala.inline
    def setRepresent(
      value: (js.Function1[/* data */ js.Object, _]) | (StringDictionary[js.Function1[/* data */ js.Object, _]])
    ): Self = this.set("represent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepresent: Self = this.set("represent", js.undefined)
    @scala.inline
    def setResolve(value: /* data */ js.Any => Boolean): Self = this.set("resolve", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    @scala.inline
    def setStyleAliases(value: StringDictionary[js.Any]): Self = this.set("styleAliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleAliases: Self = this.set("styleAliases", js.undefined)
  }
  
}

