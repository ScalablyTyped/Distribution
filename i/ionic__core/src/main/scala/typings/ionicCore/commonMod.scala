package typings.ionicCore

import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/common", "isFocused")
  @js.native
  def isFocused(input: HTMLInputElement): Boolean = js.native
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/common", "isFocused")
  @js.native
  def isFocused(input: HTMLTextAreaElement): Boolean = js.native
  
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/common", "relocateInput")
  @js.native
  def relocateInput(componentEl: HTMLElement, inputEl: HTMLInputElement, shouldRelocate: Boolean): Unit = js.native
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/common", "relocateInput")
  @js.native
  def relocateInput(
    componentEl: HTMLElement,
    inputEl: HTMLInputElement,
    shouldRelocate: Boolean,
    inputRelativeY: Double
  ): Unit = js.native
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/common", "relocateInput")
  @js.native
  def relocateInput(componentEl: HTMLElement, inputEl: HTMLTextAreaElement, shouldRelocate: Boolean): Unit = js.native
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/common", "relocateInput")
  @js.native
  def relocateInput(
    componentEl: HTMLElement,
    inputEl: HTMLTextAreaElement,
    shouldRelocate: Boolean,
    inputRelativeY: Double
  ): Unit = js.native
}
