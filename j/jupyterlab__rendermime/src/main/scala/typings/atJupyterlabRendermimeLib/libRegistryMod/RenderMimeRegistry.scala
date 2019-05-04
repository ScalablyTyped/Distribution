package typings
package atJupyterlabRendermimeLib.libRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime/lib/registry", "RenderMimeRegistry")
@js.native
/**
  * Construct a new rendermime.
  *
  * @param options - The options for initializing the instance.
  */
class RenderMimeRegistry () extends js.Object {
  def this(options: atJupyterlabRendermimeLib.libRegistryMod.RenderMimeRegistryNs.IOptions) = this()
  var _factories: js.Any = js.native
  var _id: js.Any = js.native
  var _ranks: js.Any = js.native
  var _types: js.Any = js.native
  /**
    * The LaTeX typesetter for the rendermime.
    */
  val latexTypesetter: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter | scala.Null = js.native
  /**
    * The object used to handle path opening links.
    */
  val linkHandler: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILinkHandler | scala.Null = js.native
  /**
    * The ordered list of mimeTypes.
    */
  val mimeTypes: js.Array[java.lang.String] = js.native
  /**
    * The object used to resolve relative urls for the rendermime instance.
    */
  val resolver: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver | scala.Null = js.native
  /**
    * The sanitizer used by the rendermime instance.
    */
  val sanitizer: atJupyterlabApputilsLib.libSanitizerMod.ISanitizer = js.native
  /**
    * Add a renderer factory to the rendermime.
    *
    * @param factory - The renderer factory of interest.
    *
    * @param rank - The rank of the renderer. A lower rank indicates
    *   a higher priority for rendering. If not given, the rank will
    *   defer to the `defaultRank` of the factory.  If no `defaultRank`
    *   is given, it will default to 100.
    *
    * #### Notes
    * The renderer will replace an existing renderer for the given
    * mimeType.
    */
  def addFactory(
    factory: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererFactory
  ): scala.Unit = js.native
  def addFactory(
    factory: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererFactory,
    rank: scala.Double
  ): scala.Unit = js.native
  def clone(options: atJupyterlabRendermimeLib.libRegistryMod.RenderMimeRegistryNs.ICloneOptions): RenderMimeRegistry = js.native
  /**
    * Create a new mime model.  This is a convenience method.
    *
    * @options - The options used to create the model.
    *
    * @returns A new mime model.
    */
  def createModel(): atJupyterlabRendermimeLib.libMimemodelMod.MimeModel = js.native
  def createModel(options: atJupyterlabRendermimeLib.libMimemodelMod.MimeModelNs.IOptions): atJupyterlabRendermimeLib.libMimemodelMod.MimeModel = js.native
  /**
    * Create a renderer for a mime type.
    *
    * @param mimeType - The mime type of interest.
    *
    * @returns A new renderer for the given mime type.
    *
    * @throws An error if no factory exists for the mime type.
    */
  def createRenderer(mimeType: java.lang.String): atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRenderer = js.native
  /**
    * Get the renderer factory registered for a mime type.
    *
    * @param mimeType - The mime type of interest.
    *
    * @returns The factory for the mime type, or `undefined`.
    */
  def getFactory(mimeType: java.lang.String): js.UndefOr[
    atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererFactory
  ] = js.native
  /**
    * Get the rank for a given mime type.
    *
    * @param mimeType - The mime type of interest.
    *
    * @returns The rank of the mime type or undefined.
    */
  def getRank(mimeType: java.lang.String): js.UndefOr[scala.Double] = js.native
  /**
    * Find the preferred mime type for a mime bundle.
    *
    * @param bundle - The bundle of mime data.
    *
    * @param safe - How to consider safe/unsafe factories. If 'ensure',
    *   it will only consider safe factories. If 'any', any factory will be
    *   considered. If 'prefer', unsafe factories will be considered, but
    *   only after the safe options have been exhausted.
    *
    * @returns The preferred mime type from the available factories,
    *   or `undefined` if the mime type cannot be rendered.
    */
  def preferredMimeType(bundle: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): js.UndefOr[java.lang.String] = js.native
  @JSName("preferredMimeType")
  def preferredMimeType_any(
    bundle: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject,
    safe: atJupyterlabRendermimeLib.atJupyterlabRendermimeLibStrings.any
  ): js.UndefOr[java.lang.String] = js.native
  @JSName("preferredMimeType")
  def preferredMimeType_ensure(
    bundle: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject,
    safe: atJupyterlabRendermimeLib.atJupyterlabRendermimeLibStrings.ensure
  ): js.UndefOr[java.lang.String] = js.native
  @JSName("preferredMimeType")
  def preferredMimeType_prefer(
    bundle: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject,
    safe: atJupyterlabRendermimeLib.atJupyterlabRendermimeLibStrings.prefer
  ): js.UndefOr[java.lang.String] = js.native
  /**
    * Remove a mime type.
    *
    * @param mimeType - The mime type of interest.
    */
  def removeMimeType(mimeType: java.lang.String): scala.Unit = js.native
  /**
    * Set the rank of a given mime type.
    *
    * @param mimeType - The mime type of interest.
    *
    * @param rank - The new rank to assign.
    *
    * #### Notes
    * This is a no-op if the mime type is not registered.
    */
  def setRank(mimeType: java.lang.String, rank: scala.Double): scala.Unit = js.native
}

