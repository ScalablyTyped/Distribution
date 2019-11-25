package typings.atIonicCore.distTypesComponentsMod.LocalJSX

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonModal extends js.Object {
  /**
    * If `true`, the modal will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the modal will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  /**
    * The component to display inside of the modal.
    */
  var component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentRef */ js.Any
  /**
    * The data to pass to the modal component.
    */
  var componentProps: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps */ js.Any
  ] = js.undefined
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Animation to use when the modal is presented.
    */
  var enterAnimation: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Animation to use when the modal is dismissed.
    */
  var leaveAnimation: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Emitted after the modal has dismissed.
    */
  var onIonModalDidDismiss: js.UndefOr[
    js.Function1[
      /* event */ CustomEvent[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayEventDetail */ _
      ], 
      Unit
    ]
  ] = js.undefined
  /**
    * Emitted after the modal has presented.
    */
  var onIonModalDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted before the modal has dismissed.
    */
  var onIonModalWillDismiss: js.UndefOr[
    js.Function1[
      /* event */ CustomEvent[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayEventDetail */ _
      ], 
      Unit
    ]
  ] = js.undefined
  /**
    * Emitted before the modal has presented.
    */
  var onIonModalWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * If `true`, a backdrop will be displayed behind the modal.
    */
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
}

object IonModal {
  @scala.inline
  def apply(
    component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentRef */ js.Any,
    animated: js.UndefOr[Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[Boolean] = js.undefined,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps */ js.Any = null,
    cssClass: String | js.Array[String] = null,
    enterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    mode: ios | md = null,
    onIonModalDidDismiss: /* event */ CustomEvent[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayEventDetail */ _
    ] => Unit = null,
    onIonModalDidPresent: /* event */ CustomEvent[Unit] => Unit = null,
    onIonModalWillDismiss: /* event */ CustomEvent[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayEventDetail */ _
    ] => Unit = null,
    onIonModalWillPresent: /* event */ CustomEvent[Unit] => Unit = null,
    showBackdrop: js.UndefOr[Boolean] = js.undefined
  ): IonModal = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss.asInstanceOf[js.Any])
    if (componentProps != null) __obj.updateDynamic("componentProps")(componentProps.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.asInstanceOf[js.Any])
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(leaveAnimation.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonModalDidDismiss != null) __obj.updateDynamic("onIonModalDidDismiss")(js.Any.fromFunction1(onIonModalDidDismiss))
    if (onIonModalDidPresent != null) __obj.updateDynamic("onIonModalDidPresent")(js.Any.fromFunction1(onIonModalDidPresent))
    if (onIonModalWillDismiss != null) __obj.updateDynamic("onIonModalWillDismiss")(js.Any.fromFunction1(onIonModalWillDismiss))
    if (onIonModalWillPresent != null) __obj.updateDynamic("onIonModalWillPresent")(js.Any.fromFunction1(onIonModalWillPresent))
    if (!js.isUndefined(showBackdrop)) __obj.updateDynamic("showBackdrop")(showBackdrop.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonModal]
  }
}

