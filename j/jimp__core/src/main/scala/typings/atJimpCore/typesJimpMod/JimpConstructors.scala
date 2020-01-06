package typings.atJimpCore.typesJimpMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.atJimpCore.typesEtcMod.Bitmap
import typings.atJimpCore.typesEtcMod.ImageCallback
import typings.atJimpCore.typesEtcMod.URLOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JimpConstructors
  extends // For custom constructors when using Jimp.appendConstructorOption
Instantiable1[
      (/* args (repeated) */ js.Any) | (/* data */ Bitmap) | (/* data */ Buffer) | (/* image */ Jimp) | (/* path */ String) | (/* urlOptions */ URLOptions), 
      JimpConstructors
    ]
     with Instantiable2[
      (/* data */ Bitmap) | (/* data */ Buffer) | (/* w */ Double) | (/* image */ Jimp) | (/* path */ String) | (/* urlOptions */ URLOptions), 
      (/* h */ Double) | (/* cb */ ImageCallback[JimpConstructors]), 
      JimpConstructors
    ]
     with Instantiable3[
      /* w */ Double, 
      /* h */ Double, 
      (/* background */ Double) | (/* cb */ ImageCallback[JimpConstructors]) | (/* background */ String), 
      JimpConstructors
    ]
     with Instantiable4[
      /* w */ Double, 
      /* h */ Double, 
      (/* background */ Double) | (/* background */ String), 
      /* cb */ ImageCallback[JimpConstructors], 
      JimpConstructors
    ]

