package typings.jestValidate.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jestValidate.typesMod.DeprecatedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dicts
  extends /* s */ StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
    ] {
  var deprecationEntries: DeprecatedOptions = js.native
}

object Dicts {
  @scala.inline
  def apply(deprecationEntries: DeprecatedOptions): Dicts = {
    val __obj = js.Dynamic.literal(deprecationEntries = deprecationEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dicts]
  }
  @scala.inline
  implicit class DictsOps[Self <: Dicts] (val x: Self) extends AnyVal {
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
    def setDeprecationEntries(value: DeprecatedOptions): Self = this.set("deprecationEntries", value.asInstanceOf[js.Any])
  }
  
}

