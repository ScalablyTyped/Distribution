package typings.jestWatcher.promptMod

import typings.jestWatcher.typesMod.ScrollOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-watcher/build/lib/Prompt", JSImport.Default)
@js.native
class default () extends Prompt {
  /* CompleteClass */
  override var _entering: js.Any = js.native
  /* CompleteClass */
  override var _offset: js.Any = js.native
  /* CompleteClass */
  override var _onCancel: js.Any = js.native
  /* CompleteClass */
  override var _onChange: js.Any = js.native
  /* CompleteClass */
  override var _onResize: js.Any = js.native
  /* CompleteClass */
  override var _onSuccess: js.Any = js.native
  /* CompleteClass */
  override var _promptLength: js.Any = js.native
  /* CompleteClass */
  override var _selection: js.Any = js.native
  /* CompleteClass */
  override var _value: js.Any = js.native
  /* CompleteClass */
  override def abort(): Unit = js.native
  /* CompleteClass */
  override def enter(
    onChange: js.Function2[/* pattern */ String, /* options */ ScrollOptions, Unit],
    onSuccess: js.Function1[/* pattern */ String, Unit],
    onCancel: js.Function0[Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def isEntering(): Boolean = js.native
  /* CompleteClass */
  override def put(key: String): Unit = js.native
  /* CompleteClass */
  override def setPromptLength(length: Double): Unit = js.native
  /* CompleteClass */
  override def setPromptSelection(selected: String): Unit = js.native
}

