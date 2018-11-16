package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// region Animation
// #region Animation
/**
     * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#animation-factory }\`
     * @since 1.8
     */
@js.native
trait AnimationStatic extends js.Object {
  /**
           * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#animation-factory }\`
           * @since 1.8
           */
  def apply[TElement](element: TElement, props: PlainObject[_], opts: EffectsOptions[TElement]): Animation[TElement] = js.native
  /**
           * During the initial setup, `jQuery.Animation` will call any callbacks that have been registered through `jQuery.Animation.prefilter( function( element, props, opts ) )`.
           * @param callback The prefilter will have `this` set to an animation object, and you can modify any of the `props` or
           *                 `opts` however you need. The prefilter _may_ return its own promise which also implements `stop()`,
           *                 in which case, processing of prefilters stops. If the prefilter is not trying to override the animation
           *                 entirely, it should return `undefined` or some other falsy value.
           * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#prefilters }\`
           * @since 1.8
           */
  def prefilter[TElement](
    callback: js.ThisFunction3[
      /* this */ Animation[TElement], 
      /* element */ TElement, 
      /* props */ PlainObject[_], 
      /* opts */ EffectsOptions[TElement], 
      Animation[TElement] | _Falsy | scala.Unit
    ]
  ): scala.Unit = js.native
  /**
           * During the initial setup, `jQuery.Animation` will call any callbacks that have been registered through `jQuery.Animation.prefilter( function( element, props, opts ) )`.
           * @param callback The prefilter will have `this` set to an animation object, and you can modify any of the `props` or
           *                 `opts` however you need. The prefilter _may_ return its own promise which also implements `stop()`,
           *                 in which case, processing of prefilters stops. If the prefilter is not trying to override the animation
           *                 entirely, it should return `undefined` or some other falsy value.
           * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#prefilters }\`
           * @since 1.8
           */
  def prefilter[TElement](
    callback: js.ThisFunction3[
      /* this */ Animation[TElement], 
      /* element */ TElement, 
      /* props */ PlainObject[_], 
      /* opts */ EffectsOptions[TElement], 
      Animation[TElement] | _Falsy | scala.Unit
    ],
    prepend: scala.Boolean
  ): scala.Unit = js.native
  /**
           * A "Tweener" is a function responsible for creating a tween object, and you might want to override these if you want to implement complex values ( like a clip/transform array matrix ) in a single property.
           *
           * You can override the default process for creating a tween in order to provide your own tween object by using `jQuery.Animation.tweener( props, callback( prop, value ) )`.
           * @param props A space separated list of properties to be passed to your tweener, or `"*"` if it should be called
           *              for all properties.
           * @param callback The callback will be called with `this` being an `Animation` object. The tweener function will
           *                 generally start with `var tween = this.createTween( prop, value );`, but doesn't nessecarily need to
           *                 use the `jQuery.Tween()` factory.
           * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweeners }\`
           * @since 1.8
           */
  def tweener(props: java.lang.String, callback: Tweener[_]): scala.Unit = js.native
}

