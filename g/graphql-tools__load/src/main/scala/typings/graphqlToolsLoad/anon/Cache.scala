package typings.graphqlToolsLoad.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphqlToolsUtils.loadersMod.Loader
import typings.graphqlToolsUtils.loadersMod.SingleFileOptions
import typings.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  var cache: js.UndefOr[StringDictionary[Source]] = js.native
  var filterKinds: js.UndefOr[js.Array[String]] = js.native
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  var loaders: js.Array[Loader[String, SingleFileOptions]] = js.native
  var sort: js.UndefOr[Boolean] = js.native
}

object Cache {
  @scala.inline
  def apply(loaders: js.Array[Loader[String, SingleFileOptions]]): Cache = {
    val __obj = js.Dynamic.literal(loaders = loaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
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
    def setLoadersVarargs(value: (Loader[String, SingleFileOptions])*): Self = this.set("loaders", js.Array(value :_*))
    @scala.inline
    def setLoaders(value: js.Array[Loader[String, SingleFileOptions]]): Self = this.set("loaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setCache(value: StringDictionary[Source]): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setFilterKindsVarargs(value: String*): Self = this.set("filterKinds", js.Array(value :_*))
    @scala.inline
    def setFilterKinds(value: js.Array[String]): Self = this.set("filterKinds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterKinds: Self = this.set("filterKinds", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

