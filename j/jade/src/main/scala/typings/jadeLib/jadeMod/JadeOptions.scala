package typings
package jadeLib.jadeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JadeOptions extends js.Object {
  var basedir: js.UndefOr[java.lang.String] = js.undefined
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var compileDebug: js.UndefOr[scala.Boolean] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var doctype: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var filters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[JadeCustomFilterFunction]] = js.undefined
  var globals: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var inlineRuntimeFunctions: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pretty: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var self: js.UndefOr[scala.Boolean] = js.undefined
}

object JadeOptions {
  @scala.inline
  def apply(
    basedir: java.lang.String = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    compileDebug: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    doctype: java.lang.String = null,
    filename: java.lang.String = null,
    filters: org.scalablytyped.runtime.StringDictionary[JadeCustomFilterFunction] = null,
    globals: js.Array[java.lang.String] = null,
    inlineRuntimeFunctions: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    pretty: scala.Boolean | java.lang.String = null,
    self: js.UndefOr[scala.Boolean] = js.undefined
  ): JadeOptions = {
    val __obj = js.Dynamic.literal()
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(compileDebug)) __obj.updateDynamic("compileDebug")(compileDebug)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (doctype != null) __obj.updateDynamic("doctype")(doctype)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (!js.isUndefined(inlineRuntimeFunctions)) __obj.updateDynamic("inlineRuntimeFunctions")(inlineRuntimeFunctions)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pretty != null) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[JadeOptions]
  }
}

