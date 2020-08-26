package typings.lodashWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var caching: js.UndefOr[Boolean] = js.native
  var chaining: js.UndefOr[Boolean] = js.native
  var cloning: js.UndefOr[Boolean] = js.native
  var coercions: js.UndefOr[Boolean] = js.native
  var collections: js.UndefOr[Boolean] = js.native
  var currying: js.UndefOr[Boolean] = js.native
  var deburring: js.UndefOr[Boolean] = js.native
  var exotics: js.UndefOr[Boolean] = js.native
  var flattening: js.UndefOr[Boolean] = js.native
  var guards: js.UndefOr[Boolean] = js.native
  var memoizing: js.UndefOr[Boolean] = js.native
  var metadata: js.UndefOr[Boolean] = js.native
  var paths: js.UndefOr[Boolean] = js.native
  var placeholders: js.UndefOr[Boolean] = js.native
  var shorthands: js.UndefOr[Boolean] = js.native
  var unicode: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCaching(value: Boolean): Self = this.set("caching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaching: Self = this.set("caching", js.undefined)
    @scala.inline
    def setChaining(value: Boolean): Self = this.set("chaining", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChaining: Self = this.set("chaining", js.undefined)
    @scala.inline
    def setCloning(value: Boolean): Self = this.set("cloning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloning: Self = this.set("cloning", js.undefined)
    @scala.inline
    def setCoercions(value: Boolean): Self = this.set("coercions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoercions: Self = this.set("coercions", js.undefined)
    @scala.inline
    def setCollections(value: Boolean): Self = this.set("collections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollections: Self = this.set("collections", js.undefined)
    @scala.inline
    def setCurrying(value: Boolean): Self = this.set("currying", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrying: Self = this.set("currying", js.undefined)
    @scala.inline
    def setDeburring(value: Boolean): Self = this.set("deburring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeburring: Self = this.set("deburring", js.undefined)
    @scala.inline
    def setExotics(value: Boolean): Self = this.set("exotics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExotics: Self = this.set("exotics", js.undefined)
    @scala.inline
    def setFlattening(value: Boolean): Self = this.set("flattening", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlattening: Self = this.set("flattening", js.undefined)
    @scala.inline
    def setGuards(value: Boolean): Self = this.set("guards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuards: Self = this.set("guards", js.undefined)
    @scala.inline
    def setMemoizing(value: Boolean): Self = this.set("memoizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoizing: Self = this.set("memoizing", js.undefined)
    @scala.inline
    def setMetadata(value: Boolean): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setPaths(value: Boolean): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    @scala.inline
    def setPlaceholders(value: Boolean): Self = this.set("placeholders", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholders: Self = this.set("placeholders", js.undefined)
    @scala.inline
    def setShorthands(value: Boolean): Self = this.set("shorthands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShorthands: Self = this.set("shorthands", js.undefined)
    @scala.inline
    def setUnicode(value: Boolean): Self = this.set("unicode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicode: Self = this.set("unicode", js.undefined)
  }
  
}

