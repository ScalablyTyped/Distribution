package typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistryNs

import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILinkHandler
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ISanitizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to clone a rendermime instance.
  */
trait ICloneOptions extends js.Object {
  /**
    * The new LaTeX typesetter.
    */
  var latexTypesetter: js.UndefOr[
    typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter
  ] = js.undefined
  /**
    * The new path handler.
    */
  var linkHandler: js.UndefOr[ILinkHandler] = js.undefined
  /**
    * The new resolver object.
    */
  var resolver: js.UndefOr[IResolver] = js.undefined
  /**
    * The new sanitizer used to sanitize untrusted html inputs.
    */
  var sanitizer: js.UndefOr[ISanitizer] = js.undefined
}

object ICloneOptions {
  @scala.inline
  def apply(
    latexTypesetter: typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter = null,
    linkHandler: ILinkHandler = null,
    resolver: IResolver = null,
    sanitizer: ISanitizer = null
  ): ICloneOptions = {
    val __obj = js.Dynamic.literal()
    if (latexTypesetter != null) __obj.updateDynamic("latexTypesetter")(latexTypesetter)
    if (linkHandler != null) __obj.updateDynamic("linkHandler")(linkHandler)
    if (resolver != null) __obj.updateDynamic("resolver")(resolver)
    if (sanitizer != null) __obj.updateDynamic("sanitizer")(sanitizer)
    __obj.asInstanceOf[ICloneOptions]
  }
}

