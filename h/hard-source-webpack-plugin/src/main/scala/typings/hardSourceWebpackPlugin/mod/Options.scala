package typings.hardSourceWebpackPlugin.mod

import typings.hardSourceWebpackPlugin.anon.Directories
import typings.hardSourceWebpackPlugin.anon.Level
import typings.hardSourceWebpackPlugin.anon.MaxAge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cacheDirectory: js.UndefOr[String] = js.native
  var cachePrune: js.UndefOr[MaxAge] = js.native
  var configHash: js.UndefOr[
    String | (js.Function1[
      /* webpackConfig */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
      ], 
      String
    ])
  ] = js.native
  var environmentHash: js.UndefOr[Directories] = js.native
  var info: js.UndefOr[Level] = js.native
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
    def setCacheDirectory(value: String): Self = this.set("cacheDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheDirectory: Self = this.set("cacheDirectory", js.undefined)
    @scala.inline
    def setCachePrune(value: MaxAge): Self = this.set("cachePrune", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachePrune: Self = this.set("cachePrune", js.undefined)
    @scala.inline
    def setConfigHashFunction1(
      value: /* webpackConfig */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
        ] => String
    ): Self = this.set("configHash", js.Any.fromFunction1(value))
    @scala.inline
    def setConfigHash(
      value: String | (js.Function1[
          /* webpackConfig */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
          ], 
          String
        ])
    ): Self = this.set("configHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigHash: Self = this.set("configHash", js.undefined)
    @scala.inline
    def setEnvironmentHash(value: Directories): Self = this.set("environmentHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentHash: Self = this.set("environmentHash", js.undefined)
    @scala.inline
    def setInfo(value: Level): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
  }
  
}

