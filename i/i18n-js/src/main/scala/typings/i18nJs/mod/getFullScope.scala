package typings.i18nJs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line prefer-declare-function
@JSImport("i18n-js", "getFullScope")
@js.native
object getFullScope
  extends TopLevel[
      js.Function2[
        /* scope */ String | js.Array[String], 
        /* options */ js.UndefOr[TranslateOptions], 
        String
      ]
    ]

