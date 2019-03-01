package typings
package lessDashMiddlewareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssImportPaths extends js.Object {
  /**
    * Function that modifies the import paths used by the less parser per request.
    */
  var importPaths: js.UndefOr[
    js.Function2[
      /* paths */ js.Array[java.lang.String], 
      /* req */ expressLib.expressMod.eNs.Request, 
      js.Array[java.lang.String]
    ]
  ] = js.undefined
  /**
    * Function that modifies the raw less output before being parsed and compiled.
    */
  var less: js.UndefOr[
    js.Function2[
      /* css */ java.lang.String, 
      /* req */ expressLib.expressMod.eNs.Request, 
      java.lang.String
    ]
  ] = js.undefined
  /**
    * Function that modifies the less pathname before being loaded from the filesystem.
    */
  var path: js.UndefOr[
    js.Function2[
      /* pathname */ java.lang.String, 
      /* req */ expressLib.expressMod.eNs.Request, 
      java.lang.String
    ]
  ] = js.undefined
}

object Anon_CssImportPaths {
  @scala.inline
  def apply(
    importPaths: js.Function2[
      /* paths */ js.Array[java.lang.String], 
      /* req */ expressLib.expressMod.eNs.Request, 
      js.Array[java.lang.String]
    ] = null,
    less: js.Function2[
      /* css */ java.lang.String, 
      /* req */ expressLib.expressMod.eNs.Request, 
      java.lang.String
    ] = null,
    path: js.Function2[
      /* pathname */ java.lang.String, 
      /* req */ expressLib.expressMod.eNs.Request, 
      java.lang.String
    ] = null
  ): Anon_CssImportPaths = {
    val __obj = js.Dynamic.literal()
    if (importPaths != null) __obj.updateDynamic("importPaths")(importPaths)
    if (less != null) __obj.updateDynamic("less")(less)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_CssImportPaths]
  }
}

