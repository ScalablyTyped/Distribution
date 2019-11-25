package typings.atJupyterlabRendermime.libRegistryMod.RenderMimeRegistry

import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.ILatexTypesetter
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.ILinkHandler
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRendererFactory
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IResolver
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.ISanitizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a rendermime instance.
  */
trait IOptions extends js.Object {
  /**
    * Initial factories to add to the rendermime instance.
    */
  var initialFactories: js.UndefOr[js.Array[IRendererFactory]] = js.undefined
  /**
    * An optional LaTeX typesetter.
    */
  var latexTypesetter: js.UndefOr[ILatexTypesetter] = js.undefined
  /**
    * An optional path handler.
    */
  var linkHandler: js.UndefOr[ILinkHandler] = js.undefined
  /**
    * The initial resolver object.
    *
    * The default is `null`.
    */
  var resolver: js.UndefOr[IResolver] = js.undefined
  /**
    * The sanitizer used to sanitize untrusted html inputs.
    *
    * If not given, a default sanitizer will be used.
    */
  var sanitizer: js.UndefOr[ISanitizer] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    initialFactories: js.Array[IRendererFactory] = null,
    latexTypesetter: ILatexTypesetter = null,
    linkHandler: ILinkHandler = null,
    resolver: IResolver = null,
    sanitizer: ISanitizer = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (initialFactories != null) __obj.updateDynamic("initialFactories")(initialFactories.asInstanceOf[js.Any])
    if (latexTypesetter != null) __obj.updateDynamic("latexTypesetter")(latexTypesetter.asInstanceOf[js.Any])
    if (linkHandler != null) __obj.updateDynamic("linkHandler")(linkHandler.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    if (sanitizer != null) __obj.updateDynamic("sanitizer")(sanitizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

