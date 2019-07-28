package typings.jqueryDashSlugify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Custom extends js.Object {
  var custom: js.Array[String]
  var lang: String | Boolean
  var maintainCase: Boolean
  var mark: Boolean
  var separator: String
  var symbols: Boolean
  var titleCase: js.Array[String] | Boolean
  var truncate: Double
  var uric: Boolean
  var uricNoSlash: Boolean
  def postSlug(source: String): String
  def preSlug(source: String): String
  def slugFunc(
    input: String,
    options: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-slugify.jquery-slugify.Options */ js.Object
  ): String
}

object Anon_Custom {
  @scala.inline
  def apply(
    custom: js.Array[String],
    lang: String | Boolean,
    maintainCase: Boolean,
    mark: Boolean,
    postSlug: String => String,
    preSlug: String => String,
    separator: String,
    slugFunc: (String, /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-slugify.jquery-slugify.Options */ js.Object) => String,
    symbols: Boolean,
    titleCase: js.Array[String] | Boolean,
    truncate: Double,
    uric: Boolean,
    uricNoSlash: Boolean
  ): Anon_Custom = {
    val __obj = js.Dynamic.literal(custom = custom, lang = lang.asInstanceOf[js.Any], maintainCase = maintainCase, mark = mark, postSlug = js.Any.fromFunction1(postSlug), preSlug = js.Any.fromFunction1(preSlug), separator = separator, slugFunc = js.Any.fromFunction2(slugFunc), symbols = symbols, titleCase = titleCase.asInstanceOf[js.Any], truncate = truncate, uric = uric, uricNoSlash = uricNoSlash)
  
    __obj.asInstanceOf[Anon_Custom]
  }
}

