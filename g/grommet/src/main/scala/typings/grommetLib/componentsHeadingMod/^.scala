package typings
package grommetLib.componentsHeadingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Heading", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Heading: reactLib.reactMod.ReactNs.FC[
    HeadingProps with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.ReactNs.DetailedHTMLProps[
        reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLHeadingElement], 
        reactLib.HTMLHeadingElement
      ], 
      grommetLib.grommetLibStrings.color
    ])
  ] = js.native
}

