package typings.ink.transformMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transform a string representation of React components before they are written to output.
  * For example, you might want to apply a gradient to text, add a clickable link or create some text effects.
  * These use cases can't accept React nodes as input, they are expecting a string.
  * That's what <Transform> component does, it gives you an output string of its child components and lets you transform it in any way.
  */
@JSImport("ink/build/components/Transform", JSImport.Default)
@js.native
object default extends TopLevel[FC[Props]]
