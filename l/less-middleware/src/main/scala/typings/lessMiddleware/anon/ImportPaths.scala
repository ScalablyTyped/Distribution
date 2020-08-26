package typings.lessMiddleware.anon

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportPaths extends js.Object {
  /**
    * Function that modifies the import paths used by the less parser per request.
    */
  var importPaths: js.UndefOr[
    js.Function2[
      /* paths */ js.Array[String], 
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      js.Array[String]
    ]
  ] = js.native
  /**
    * Function that modifies the raw less output before being parsed and compiled.
    */
  var less: js.UndefOr[
    js.Function2[/* css */ String, /* req */ Request_[ParamsDictionary, _, _, Query], String]
  ] = js.native
  /**
    * Function that modifies the less pathname before being loaded from the filesystem.
    */
  var path: js.UndefOr[
    js.Function2[/* pathname */ String, /* req */ Request_[ParamsDictionary, _, _, Query], String]
  ] = js.native
}

object ImportPaths {
  @scala.inline
  def apply(): ImportPaths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportPaths]
  }
  @scala.inline
  implicit class ImportPathsOps[Self <: ImportPaths] (val x: Self) extends AnyVal {
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
    def setImportPaths(
      value: (/* paths */ js.Array[String], /* req */ Request_[ParamsDictionary, _, _, Query]) => js.Array[String]
    ): Self = this.set("importPaths", js.Any.fromFunction2(value))
    @scala.inline
    def deleteImportPaths: Self = this.set("importPaths", js.undefined)
    @scala.inline
    def setLess(value: (/* css */ String, /* req */ Request_[ParamsDictionary, _, _, Query]) => String): Self = this.set("less", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLess: Self = this.set("less", js.undefined)
    @scala.inline
    def setPath(value: (/* pathname */ String, /* req */ Request_[ParamsDictionary, _, _, Query]) => String): Self = this.set("path", js.Any.fromFunction2(value))
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

