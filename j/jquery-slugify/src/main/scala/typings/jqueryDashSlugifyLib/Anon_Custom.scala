package typings
package jqueryDashSlugifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Custom extends js.Object {
  var custom: js.Array[java.lang.String]
  var lang: java.lang.String | scala.Boolean
  var maintainCase: scala.Boolean
  var mark: scala.Boolean
  var separator: java.lang.String
  var symbols: scala.Boolean
  var titleCase: js.Array[java.lang.String] | scala.Boolean
  var truncate: scala.Double
  var uric: scala.Boolean
  var uricNoSlash: scala.Boolean
  def postSlug(source: java.lang.String): java.lang.String
  def preSlug(source: java.lang.String): java.lang.String
  def slugFunc(
    input: java.lang.String,
    options: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-slugify.jquery-slugify.Options */ js.Object
  ): java.lang.String
}

object Anon_Custom {
  @scala.inline
  def apply(
    custom: js.Array[java.lang.String],
    lang: java.lang.String | scala.Boolean,
    maintainCase: scala.Boolean,
    mark: scala.Boolean,
    postSlug: js.Function1[java.lang.String, java.lang.String],
    preSlug: js.Function1[java.lang.String, java.lang.String],
    separator: java.lang.String,
    slugFunc: js.Function2[
      java.lang.String, 
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-slugify.jquery-slugify.Options */ js.Object, 
      java.lang.String
    ],
    symbols: scala.Boolean,
    titleCase: js.Array[java.lang.String] | scala.Boolean,
    truncate: scala.Double,
    uric: scala.Boolean,
    uricNoSlash: scala.Boolean
  ): Anon_Custom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("custom")(custom)
    __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    __obj.updateDynamic("maintainCase")(maintainCase)
    __obj.updateDynamic("mark")(mark)
    __obj.updateDynamic("postSlug")(postSlug)
    __obj.updateDynamic("preSlug")(preSlug)
    __obj.updateDynamic("separator")(separator)
    __obj.updateDynamic("slugFunc")(slugFunc)
    __obj.updateDynamic("symbols")(symbols)
    __obj.updateDynamic("titleCase")(titleCase.asInstanceOf[js.Any])
    __obj.updateDynamic("truncate")(truncate)
    __obj.updateDynamic("uric")(uric)
    __obj.updateDynamic("uricNoSlash")(uricNoSlash)
    __obj.asInstanceOf[Anon_Custom]
  }
}

