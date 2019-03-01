package typings
package atLinguiCoreLib.i18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messages
  extends /* key */ org.scalablytyped.runtime.StringDictionary[
      java.lang.String | (js.Function1[
        /* context */ js.Function3[
          /* name */ java.lang.String, 
          /* type */ js.UndefOr[java.lang.String], 
          /* format */ js.UndefOr[js.Any], 
          java.lang.String
        ], 
        java.lang.String | js.Array[java.lang.String]
      ])
    ]

object Messages {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[
      java.lang.String | (js.Function1[
        /* context */ js.Function3[
          /* name */ java.lang.String, 
          /* type */ js.UndefOr[java.lang.String], 
          /* format */ js.UndefOr[js.Any], 
          java.lang.String
        ], 
        java.lang.String | js.Array[java.lang.String]
      ])
    ] = null
  ): Messages = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Messages]
  }
}

