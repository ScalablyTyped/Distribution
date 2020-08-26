package typings.lasso.lassoMod

import typings.lasso.dependenciesMod.DependencyConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageConfig extends js.Object {
  var cache: js.UndefOr[js.Any] = js.native
  var cacheKey: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var dependencies: (js.Array[DependencyConfig | String]) | String | Null = js.native
  var flags: js.UndefOr[js.Array[String]] = js.native
  var from: js.UndefOr[String] = js.native
  var lassoContext: js.UndefOr[typings.lasso.lassoContextMod.default] = js.native
  var name: js.UndefOr[String] = js.native
  var packagePath: js.UndefOr[String] = js.native
  var packagePaths: js.UndefOr[js.Array[String]] = js.native
  var pageName: js.UndefOr[String] = js.native
}

object PageConfig {
  @scala.inline
  def apply(): PageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageConfig]
  }
  @scala.inline
  implicit class PageConfigOps[Self <: PageConfig] (val x: Self) extends AnyVal {
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
    def setCache(value: js.Any): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCacheKey(value: String): Self = this.set("cacheKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheKey: Self = this.set("cacheKey", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDependenciesVarargs(value: (DependencyConfig | String)*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: (js.Array[DependencyConfig | String]) | String): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependenciesNull: Self = this.set("dependencies", null)
    @scala.inline
    def setFlagsVarargs(value: String*): Self = this.set("flags", js.Array(value :_*))
    @scala.inline
    def setFlags(value: js.Array[String]): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setLassoContext(value: typings.lasso.lassoContextMod.default): Self = this.set("lassoContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLassoContext: Self = this.set("lassoContext", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPackagePath(value: String): Self = this.set("packagePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackagePath: Self = this.set("packagePath", js.undefined)
    @scala.inline
    def setPackagePathsVarargs(value: String*): Self = this.set("packagePaths", js.Array(value :_*))
    @scala.inline
    def setPackagePaths(value: js.Array[String]): Self = this.set("packagePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackagePaths: Self = this.set("packagePaths", js.undefined)
    @scala.inline
    def setPageName(value: String): Self = this.set("pageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageName: Self = this.set("pageName", js.undefined)
  }
  
}

