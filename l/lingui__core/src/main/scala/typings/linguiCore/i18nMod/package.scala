package typings.linguiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object i18nMod {
  type Catalogs = org.scalablytyped.runtime.StringDictionary[typings.linguiCore.i18nMod.Catalog]
  type Messages = org.scalablytyped.runtime.StringDictionary[
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
}
