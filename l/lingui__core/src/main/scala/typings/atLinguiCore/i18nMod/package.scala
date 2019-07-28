package typings.atLinguiCore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object i18nMod {
  type Catalogs = StringDictionary[Catalog]
  type Messages = StringDictionary[
    String | (js.Function1[
      /* context */ js.Function3[
        /* name */ String, 
        /* type */ js.UndefOr[String], 
        /* format */ js.UndefOr[js.Any], 
        String
      ], 
      String | js.Array[String]
    ])
  ]
}
