package typings.lessMiddleware

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImportPaths extends js.Object {
  /**
    * Function that modifies the import paths used by the less parser per request.
    */
  var importPaths: js.UndefOr[
    js.Function2[/* paths */ js.Array[String], /* req */ Request_[ParamsDictionary], js.Array[String]]
  ] = js.undefined
  /**
    * Function that modifies the raw less output before being parsed and compiled.
    */
  var less: js.UndefOr[js.Function2[/* css */ String, /* req */ Request_[ParamsDictionary], String]] = js.undefined
  /**
    * Function that modifies the less pathname before being loaded from the filesystem.
    */
  var path: js.UndefOr[
    js.Function2[/* pathname */ String, /* req */ Request_[ParamsDictionary], String]
  ] = js.undefined
}

object AnonImportPaths {
  @scala.inline
  def apply(
    importPaths: (/* paths */ js.Array[String], /* req */ Request_[ParamsDictionary]) => js.Array[String] = null,
    less: (/* css */ String, /* req */ Request_[ParamsDictionary]) => String = null,
    path: (/* pathname */ String, /* req */ Request_[ParamsDictionary]) => String = null
  ): AnonImportPaths = {
    val __obj = js.Dynamic.literal()
    if (importPaths != null) __obj.updateDynamic("importPaths")(js.Any.fromFunction2(importPaths))
    if (less != null) __obj.updateDynamic("less")(js.Any.fromFunction2(less))
    if (path != null) __obj.updateDynamic("path")(js.Any.fromFunction2(path))
    __obj.asInstanceOf[AnonImportPaths]
  }
}

