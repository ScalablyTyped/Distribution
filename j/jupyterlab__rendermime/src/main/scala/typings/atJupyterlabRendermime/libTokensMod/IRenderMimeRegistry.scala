package typings.atJupyterlabRendermime.libTokensMod

import typings.atJupyterlabApputils.libSanitizerMod.ISanitizer
import typings.atJupyterlabRendermime.atJupyterlabRendermimeStrings.any
import typings.atJupyterlabRendermime.atJupyterlabRendermimeStrings.ensure
import typings.atJupyterlabRendermime.atJupyterlabRendermimeStrings.prefer
import typings.atJupyterlabRendermime.libMimemodelMod.MimeModel
import typings.atJupyterlabRendermime.libMimemodelMod.MimeModelNs.IOptions
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistryNs.ICloneOptions
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILinkHandler
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRenderer
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererFactory
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRenderMimeRegistry extends js.Object {
  /**
    * The LaTeX typesetter for the rendermime.
    */
  val latexTypesetter: typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter | Null = js.native
  /**
    * The object used to handle path opening links.
    */
  val linkHandler: ILinkHandler | Null = js.native
  /**
    * The ordered list of mimeTypes.
    */
  val mimeTypes: js.Array[String] = js.native
  /**
    * The object used to resolve relative urls for the rendermime instance.
    */
  val resolver: IResolver | Null = js.native
  /**
    * The sanitizer used by the rendermime instance.
    */
  val sanitizer: ISanitizer = js.native
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
  def addFactory(factory: IRendererFactory): Unit = js.native
  def addFactory(factory: IRendererFactory, rank: Double): Unit = js.native
  def clone(options: ICloneOptions): IRenderMimeRegistry = js.native
  /**
    * Create a new mime model.  This is a convenience method.
    *
    * @options - The options used to create the model.
    *
    * @returns A new mime model.
    */
  def createModel(): MimeModel = js.native
  def createModel(options: IOptions): MimeModel = js.native
  /**
    * Create a renderer for a mime type.
    *
    * @param mimeType - The mime type of interest.
    *
    * @returns A new renderer for the given mime type.
    *
    * @throws An error if no factory exists for the mime type.
    */
  def createRenderer(mimeType: String): IRenderer = js.native
  /**
    * Get the renderer factory registered for a mime type.
    *
    * @param mimeType - The mime type of interest.
    *
    * @returns The factory for the mime type, or `undefined`.
    */
  def getFactory(mimeType: String): js.UndefOr[IRendererFactory] = js.native
  /**
    * Get the rank for a given mime type.
    *
    * @param mimeType - The mime type of interest.
    *
    * @returns The rank of the mime type or undefined.
    */
  def getRank(mimeType: String): js.UndefOr[Double] = js.native
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
  def preferredMimeType(bundle: ReadonlyJSONObject): js.UndefOr[String] = js.native
  @JSName("preferredMimeType")
  def preferredMimeType_any(bundle: ReadonlyJSONObject, safe: any): js.UndefOr[String] = js.native
  @JSName("preferredMimeType")
  def preferredMimeType_ensure(bundle: ReadonlyJSONObject, safe: ensure): js.UndefOr[String] = js.native
  @JSName("preferredMimeType")
  def preferredMimeType_prefer(bundle: ReadonlyJSONObject, safe: prefer): js.UndefOr[String] = js.native
  /**
    * Remove a mime type.
    *
    * @param mimeType - The mime type of interest.
    */
  def removeMimeType(mimeType: String): Unit = js.native
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
  def setRank(mimeType: String, rank: Double): Unit = js.native
}

