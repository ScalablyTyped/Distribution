package typings.inquirer.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.inquirer.bottomBarMod.^
import typings.inquirer.mod.StreamOptions
import typings.inquirer.mod.prompts.PromptCollection
import typings.inquirer.mod.ui.BottomBarOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BottomBar extends js.Object {
  /**
    * Represents the bottom-bar UI.
    */
  var BottomBar: Instantiable1[/* options */ js.UndefOr[BottomBarOptions], ^] = js.native
  /**
    * Represents the prompt ui.
    */
  var Prompt: Instantiable2[
    /* prompts */ PromptCollection, 
    /* options */ js.UndefOr[StreamOptions], 
    typings.inquirer.promptMod.^
  ] = js.native
}

object BottomBar {
  @scala.inline
  def apply(
    BottomBar: Instantiable1[/* options */ js.UndefOr[BottomBarOptions], ^],
    Prompt: Instantiable2[
      /* prompts */ PromptCollection, 
      /* options */ js.UndefOr[StreamOptions], 
      typings.inquirer.promptMod.^
    ]
  ): BottomBar = {
    val __obj = js.Dynamic.literal(BottomBar = BottomBar.asInstanceOf[js.Any], Prompt = Prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomBar]
  }
  @scala.inline
  implicit class BottomBarOps[Self <: BottomBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBottomBar(value: Instantiable1[/* options */ js.UndefOr[BottomBarOptions], ^]): Self = this.set("BottomBar", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrompt(
      value: Instantiable2[
          /* prompts */ PromptCollection, 
          /* options */ js.UndefOr[StreamOptions], 
          typings.inquirer.promptMod.^
        ]
    ): Self = this.set("Prompt", value.asInstanceOf[js.Any])
  }
  
}

