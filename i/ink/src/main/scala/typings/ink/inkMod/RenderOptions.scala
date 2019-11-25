package typings.ink.inkMod

import typings.node.processMod._Global_.NodeJS.ReadStream
import typings.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  /**
  	 * If true, each update will be rendered as a separate output, without replacing the previous one.
  	 *
  	 * @default false
  	 */
  val debug: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Configure whether Ink should listen to Ctrl+C keyboard input and exit the app. This is needed in case `process.stdin` is in raw mode, because then Ctrl+C is ignored by default and process is expected to handle it manually.
  	 *
  	 * @default true
  	 */
  val exitOnCtrlC: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enable experimental mode and use a new and faster reconciler and renderer.
  	 * There should be no changes to the output. If there are, please report it.
  	 *
  	 * @default false
  	 */
  val experimental: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Input stream where app will listen for input.
  	 *
  	 * @default process.stdin
  	 */
  val stdin: js.UndefOr[ReadStream] = js.undefined
  /**
  	 * Output stream where app will be rendered.
  	 *
  	 * @default process.stdout
  	 */
  val stdout: js.UndefOr[WriteStream] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    exitOnCtrlC: js.UndefOr[Boolean] = js.undefined,
    experimental: js.UndefOr[Boolean] = js.undefined,
    stdin: ReadStream = null,
    stdout: WriteStream = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(exitOnCtrlC)) __obj.updateDynamic("exitOnCtrlC")(exitOnCtrlC.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    if (stdin != null) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    if (stdout != null) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
}

