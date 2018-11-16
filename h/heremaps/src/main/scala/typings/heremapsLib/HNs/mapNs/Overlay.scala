package typings
package heremapsLib.HNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * This class represents an overlay, which offers a bitmap that covers a geographical reactangular area on the map.
         */
@JSGlobal("H.map.Overlay")
@js.native
class Overlay protected () extends Object {
  /**
               * Constructor
               * @param bounds {H.geo.Rect} - The geographical reactangular area of this overlay
               * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
               * @param opt_options {H.map.Overlay.Options=} - Optional values values to initialize this overlay
               */
  def this(bounds: heremapsLib.HNs.geoNs.Rect, bitmap: java.lang.String) = this()
  /**
               * Constructor
               * @param bounds {H.geo.Rect} - The geographical reactangular area of this overlay
               * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
               * @param opt_options {H.map.Overlay.Options=} - Optional values values to initialize this overlay
               */
  def this(bounds: heremapsLib.HNs.geoNs.Rect, bitmap: stdLib.HTMLCanvasElement) = this()
  /**
               * Constructor
               * @param bounds {H.geo.Rect} - The geographical reactangular area of this overlay
               * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
               * @param opt_options {H.map.Overlay.Options=} - Optional values values to initialize this overlay
               */
  def this(bounds: heremapsLib.HNs.geoNs.Rect, bitmap: stdLib.HTMLImageElement) = this()
  /**
               * Constructor
               * @param bounds {H.geo.Rect} - The geographical reactangular area of this overlay
               * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
               * @param opt_options {H.map.Overlay.Options=} - Optional values values to initialize this overlay
               */
  def this(bounds: heremapsLib.HNs.geoNs.Rect, bitmap: java.lang.String, opt_options: heremapsLib.HNs.mapNs.OverlayNs.Options) = this()
  /**
               * Constructor
               * @param bounds {H.geo.Rect} - The geographical reactangular area of this overlay
               * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
               * @param opt_options {H.map.Overlay.Options=} - Optional values values to initialize this overlay
               */
  def this(bounds: heremapsLib.HNs.geoNs.Rect, bitmap: stdLib.HTMLCanvasElement, opt_options: heremapsLib.HNs.mapNs.OverlayNs.Options) = this()
  /**
               * Constructor
               * @param bounds {H.geo.Rect} - The geographical reactangular area of this overlay
               * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
               * @param opt_options {H.map.Overlay.Options=} - Optional values values to initialize this overlay
               */
  def this(bounds: heremapsLib.HNs.geoNs.Rect, bitmap: stdLib.HTMLImageElement, opt_options: heremapsLib.HNs.mapNs.OverlayNs.Options) = this()
  /**
               * Returns this overlay's current bitmap.
               * @returns {?(HTMLImageElement | HTMLCanvasElement)} - the bitmap of this Overlay or null if it isn't ready yet
               */
  def getBitmap(): stdLib.HTMLImageElement | stdLib.HTMLCanvasElement = js.native
  /**
               * This method returns this overlay's current bounds.
               * @returns {H.geo.Rect}
               */
  def getBounds(): heremapsLib.HNs.geoNs.Rect = js.native
  /**
               * Returns this overlay's current opacity.
               * @returns {number}
               */
  def getOpacity(): scala.Double = js.native
  /**
               * Sets the overlay's current bitmap.
               * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
               * @returns {H.map.Overlay} - the overlay itself
               */
  def setBitmap(bitmap: java.lang.String): Overlay = js.native
  /**
               * Sets the overlay's current bitmap.
               * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
               * @returns {H.map.Overlay} - the overlay itself
               */
  def setBitmap(bitmap: stdLib.HTMLCanvasElement): Overlay = js.native
  /**
               * Sets the overlay's current bitmap.
               * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
               * @returns {H.map.Overlay} - the overlay itself
               */
  def setBitmap(bitmap: stdLib.HTMLImageElement): Overlay = js.native
  /**
               * This method sets the overlay's current bounds.
               * @param bounds {H.geo.Rect}
               * @returns {H.map.Overlay} - the overlay itself
               */
  def setBounds(bounds: heremapsLib.HNs.geoNs.Rect): Overlay = js.native
  /**
               * Sets the overlay's current opacity.
               * @param opacity {number} - The opacity in range from 0 (transparent) to 1 (opaque).
               * @returns {H.map.Overlay} - the overlay itself
               */
  def setOpacity(opacity: scala.Double): Overlay = js.native
}

