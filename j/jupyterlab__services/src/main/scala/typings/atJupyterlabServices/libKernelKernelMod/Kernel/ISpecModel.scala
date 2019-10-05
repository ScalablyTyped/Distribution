package typings.atJupyterlabServices.libKernelKernelMod.Kernel

import org.scalablytyped.runtime.StringDictionary
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Kernel Spec interface.
  *
  * #### Notes
  * See [Kernel specs](https://jupyter-client.readthedocs.io/en/latest/kernels.html#kernelspecs).
  */
trait ISpecModel extends JSONObject {
  /**
    * A list of command line arguments used to start the kernel.
    */
  val argv: js.Array[String]
  /**
    * The kernel’s name as it should be displayed in the UI.
    */
  val display_name: String
  /**
    * A dictionary of environment variables to set for the kernel.
    */
  val env: js.UndefOr[JSONObject] = js.undefined
  /**
    * The name of the language of the kernel.
    */
  val language: String
  /**
    * The name of the kernel spec.
    */
  val name: String
  /**
    * A mapping of resource file name to download path.
    */
  val resources: StringDictionary[String]
}

object ISpecModel {
  @scala.inline
  def apply(
    argv: js.Array[String],
    display_name: String,
    language: String,
    name: String,
    resources: StringDictionary[String],
    env: JSONObject = null
  ): ISpecModel = {
    val __obj = js.Dynamic.literal(argv = argv, display_name = display_name, language = language, name = name, resources = resources)
    if (env != null) __obj.updateDynamic("env")(env)
    __obj.asInstanceOf[ISpecModel]
  }
}

