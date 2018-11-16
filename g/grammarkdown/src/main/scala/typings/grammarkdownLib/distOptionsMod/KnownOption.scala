package typings
package grammarkdownLib.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KnownOption extends js.Object {
  var aliasFor: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var convert: js.UndefOr[
    js.Function3[/* key */ java.lang.String, /* value */ java.lang.String, /* raw */ RawArguments, _]
  ] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var isUsage: js.UndefOr[scala.Boolean] = js.undefined
  var longName: java.lang.String
  var many: js.UndefOr[scala.Boolean] = js.undefined
  var param: js.UndefOr[java.lang.String] = js.undefined
  var shortName: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String | (stdLib.Map[java.lang.String, _])] = js.undefined
  var validate: js.UndefOr[
    js.Function3[
      /* key */ java.lang.String, 
      /* value */ java.lang.String, 
      /* raw */ RawArguments, 
      scala.Boolean
    ]
  ] = js.undefined
}

