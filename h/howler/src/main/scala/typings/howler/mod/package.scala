package typings.howler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type HowlCallback = js.Function1[/* soundId */ scala.Double, scala.Unit]
  
  type HowlErrorCallback = js.Function2[/* soundId */ scala.Double, /* error */ js.Any, scala.Unit]
  
  type SoundSpriteDefinitions = org.scalablytyped.runtime.StringDictionary[
    (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Boolean])
  ]
}
