package typings.istanbulMiddleware.anon

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.istanbulMiddleware.mod.ClientMatcher
import typings.istanbulMiddleware.mod.PathTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matcher extends js.Object {
  var matcher: js.UndefOr[ClientMatcher] = js.native
  var pathTransformer: js.UndefOr[PathTransformer] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object Matcher {
  @scala.inline
  def apply(): Matcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Matcher]
  }
  @scala.inline
  implicit class MatcherOps[Self <: Matcher] (val x: Self) extends AnyVal {
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
    def setMatcher(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => Boolean): Self = this.set("matcher", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMatcher: Self = this.set("matcher", js.undefined)
    @scala.inline
    def setPathTransformer(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String): Self = this.set("pathTransformer", js.Any.fromFunction1(value))
    @scala.inline
    def deletePathTransformer: Self = this.set("pathTransformer", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

