package typings
package js2xmlparserLib.libOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDtdOptions extends js.Object {
  /**
    * If `include` is `true`, an XML DTD is included in the resulting XML. If
    * left undefined, the default value is `true`.
    */
  var include: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the DTD. This value cannot be left undefined if `include`
    * is `true`.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The public identifier of the DTD, excluding quotation marks. If `pubId`
    * is defined, `sysId` must be defined as well. If left undefined, no
    * public identifier is included.
    */
  var pubId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The system identifier of the DTD, excluding quotation marks. If left
    * undefined, no system identifier is included.
    */
  var sysId: js.UndefOr[java.lang.String] = js.undefined
}

