package typings.inquirer

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.inquirer.inquirerMod.StreamOptions
import typings.inquirer.inquirerMod.promptsNs.PromptCollection
import typings.inquirer.inquirerMod.uiNs.BottomBarOptions
import typings.inquirer.libUiBottomDashBarMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomBar extends js.Object {
  /**
    * Represents the bottom-bar UI.
    */
  var BottomBar: Instantiable1[js.UndefOr[/* options */ BottomBarOptions], ^]
  /**
    * Represents the prompt ui.
    */
  var Prompt: Instantiable2[
    /* prompts */ PromptCollection, 
    js.UndefOr[/* options */ StreamOptions], 
    typings.inquirer.libUiPromptMod.^
  ]
}

object Anon_BottomBar {
  @scala.inline
  def apply(
    BottomBar: Instantiable1[js.UndefOr[/* options */ BottomBarOptions], ^],
    Prompt: Instantiable2[
      /* prompts */ PromptCollection, 
      js.UndefOr[/* options */ StreamOptions], 
      typings.inquirer.libUiPromptMod.^
    ]
  ): Anon_BottomBar = {
    val __obj = js.Dynamic.literal(BottomBar = BottomBar, Prompt = Prompt)
  
    __obj.asInstanceOf[Anon_BottomBar]
  }
}

