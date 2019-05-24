package typings
package js2xmlparserLib.libOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeclarationOptions extends js.Object {
  /**
    * The encoding attribute to be included in the declaration. If defined,
    * this value must be a valid encoding. By default, no encoding attribute
    * is included.
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to include a declaration in the generated XML. By default,
    * one is included.
    */
  var include: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The value of the standalone attribute to be included in the declaration.
    * If defined, this value must be "yes" or "no". By default, no standalone
    * attribute is included.
    */
  var standalone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The XML version to be included in the declaration. If defined, this
    * value must be a valid XML version number. Defaults to "1.0".
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object IDeclarationOptions {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    include: js.UndefOr[scala.Boolean] = js.undefined,
    standalone: java.lang.String = null,
    version: java.lang.String = null
  ): IDeclarationOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(include)) __obj.updateDynamic("include")(include)
    if (standalone != null) __obj.updateDynamic("standalone")(standalone)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[IDeclarationOptions]
  }
}

