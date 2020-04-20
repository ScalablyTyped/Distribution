package typings.inquirer

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.inquirer.bottomBarMod.^
import typings.inquirer.mod.StreamOptions
import typings.inquirer.mod.prompts.PromptCollection
import typings.inquirer.mod.ui.BottomBarOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottomBar extends js.Object {
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
    typings.inquirer.promptMod.^
  ]
}

object AnonBottomBar {
  @scala.inline
  def apply(
    BottomBar: Instantiable1[js.UndefOr[/* options */ BottomBarOptions], ^],
    Prompt: Instantiable2[
      /* prompts */ PromptCollection, 
      js.UndefOr[/* options */ StreamOptions], 
      typings.inquirer.promptMod.^
    ]
  ): AnonBottomBar = {
    val __obj = js.Dynamic.literal(BottomBar = BottomBar.asInstanceOf[js.Any], Prompt = Prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottomBar]
  }
}

