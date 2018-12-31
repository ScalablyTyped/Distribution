package typings
package lessDashMiddlewareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Less extends js.Object {
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

