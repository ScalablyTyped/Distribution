package typings.mapsjs.mod

import typings.mapsjs.anon.BackgroundColorStr
import typings.mapsjs.anon.BleedRatio
import typings.mapsjs.anon.Bounds
import typings.mapsjs.anon.Color
import typings.mapsjs.anon.Data
import typings.mapsjs.anon.DataFormat
import typings.mapsjs.anon.Descriptor
import typings.mapsjs.anon.EndpointCollection
import typings.mapsjs.anon.GeometryFieldName
import typings.mapsjs.anon.RenderBitmap
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tile {
  
  @JSImport("mapsjs", "tile.descriptorLocal")
  @js.native
  class descriptorLocal protected () extends StObject {
    def this(options: GeometryFieldName) = this()
  }
  
  @JSImport("mapsjs", "tile.descriptorMDNRestFeature")
  @js.native
  class descriptorMDNRestFeature protected () extends StObject {
    def this(mapId: String, layerId: String) = this()
    def this(mapId: String, layerId: String, options: BleedRatio) = this()
    
    /**
      * Gets the bleed ratio.
      * @returns {number} The current bleed ratio.
      */
    def getBleedRatio(): Double = js.native
    
    /**
      * Checks the flag whether to clip geometry fetched at the bounds 
      * of the request.
      * @returns {boolean} The value of the flag.
      */
    def getClipToRenderBounds(): Boolean = js.native
    
    /**
      * Gets the optional field names to query. This attribute data may
      * be used in dynamic client-side rendering.
      * @returns {string[]} An array of field names as strings.
      */
    def getFieldNames(): js.Array[String] = js.native
    
    /**
      * Gets the layer's ID.
      * @returns {string} The layer's ID.
      */
    def getLayerId(): String = js.native
    
    /**
      * Gets the map ID.
      * @returns {string} The map ID.
      */
    def getMapId(): String = js.native
    
    /**
      * Checks the flag whether to simplify paths based on the units per
      * pixel for the quad tile being requested.
      * @returns {boolean} The value of the flag.
      */
    def getSimplifyEnabled(): Boolean = js.native
    
    /**
      * Gets the version of the REST service.
      * @returns {string} The REST service version.
      */
    def getVersion(): String = js.native
    
    /**
      * Sets the bleed ratio. Bleeds greater than 1.0 will fetch content 
      * beyond the edge of the tile extents (this is useful for point features).
      * @param {number} br The desired bleed ratio, a number between 1.0 and 2.0.
      */
    def setBleedRatio(br: Double): Unit = js.native
    
    /**
      * Sets the flag whether to clip geometry fetched at the bounds 
      * of the request. This can greatly improve performance with large
      * complex geometries. Only supported when back-end store is SQL 
      * 2008/2012 or PostGIS.
      * @param {boolean} flag Whether or not to clip geometries fetched
      * at the bounds of the request.
      */
    def setClipToRenderBounds(flag: Boolean): Unit = js.native
    
    /** 
      * Sets the optional field names to query. This attribute data may be used in 
      * dynamic client-side rendering.
      * @param {string} names - array of strings for each field to query
      */
    def setFieldNames(names: js.Array[String]): Unit = js.native
    
    /**
      * Sets the action to perform on descriptor change.
      * @param {function} action Function with signature action().
      */
    def setNotifyDescriptorChangeAction(action: js.Function0[Unit]): Unit = js.native
    
    /**
      * Sets the flag whether to simplify paths based on the units per
      * pixel for the quad tile being requested.
      * @param {boolean} flag Whether or not to simply paths based on 
      * the units per pixel.
      */
    def setSimplifyEnabled(flag: Boolean): Unit = js.native
    
    /**
      * Sets the REST service version number.
      * @param {string} v The version number to set.
      */
    def setVersion(v: String): Unit = js.native
  }
  
  @JSImport("mapsjs", "tile.descriptorMDNRestMap")
  @js.native
  class descriptorMDNRestMap protected () extends StObject {
    def this(mapId: String) = this()
    def this(mapId: String, options: BackgroundColorStr) = this()
    
    /**
      * Gets map image background color.
      * @returns {string} CSS style string for the map image background color.
      */
    def getBackgroundColorStr(): String = js.native
    
    /**
      * Gets bleed ratio for the layer associated with this descriptor.
      * @returns {number} The bleed ratio.
      */
    def getBleedRatio(): Double = js.native
    
    /**
      * Gets image type associated with this descriptor, either 'png',
      * 'png8', or 'jpg'.
      * @returns {string} The image type associated with this descriptor.
      */
    def getImageType(): String = js.native
    
    /**
      * Checks whether or not the map background is transparent.
      * @returns {boolean} Whether or not the map background is transparent.
      */
    def getIsBackgroundTransparent(): Boolean = js.native
    
    /**
      * Gets a layer's fill color as a CSS style string or as a SQL expression.
      * @param {string} layerId The MapDotNet map layer ID.
      * @returns {string} Either the CSS style string or the SQL expression,
      * according to how the layer's fill color was set.
      */
    def getLayerFill(layerId: String): String = js.native
    
    /**
      * Gets a layer's outline color and thickness.
      * @param {string} layerId The MapDotNet map layer ID.
      * @returns {object} JavaScript object of the form {color, thickness}
      * where color is the CSS style string of the outline color and 
      * thickness is the outline thickness in pixels.
      */
    def getLayerOutline(layerId: String): Color = js.native
    
    /**
      * Gets a layer's visibility.
      * @param {string} layerId The MapDotNet map layer ID.
      * @returns {boolean} Whether or not the layer is visible.
      */
    def getLayerVisibility(layerId: String): Boolean = js.native
    
    /**
      * Gets the current layer where clause.
      * @param {string} layerId The MapDotNet map layer ID.
      * @returns {string} The current where clause. If no where clause
      * is in use, this will return an empty string.
      */
    def getLayerWhere(layerId: String): String = js.native
    
    /**
      * Returns the current separator for the layer where clause in the
      * query string. 
      * @returns {string} The current seperator.
      */
    def getLayerWhereSep(): String = js.native
    
    /**
      * Gets the optional map cache name.
      * @returns {string} The map cache name.
      */
    def getMapCacheName(): String = js.native
    
    /**
      * Gets the map's cache setting, which is one of 'None', 
      * 'ReadOnly', 'ReadWrite', 'ForceWrite', and 'Default.'
      * @returns {string} The map's cache setting.
      */
    def getMapCacheOption(): String = js.native
    
    /**
      * Gets the map ID.
      * @returns {string} The map ID.
      */
    def getMapId(): String = js.native
    
    /**
      * Gets a tag which is used to modify the request URIs to avoid 
      * browser caching
      * @returns {string} The map's tag.
      */
    def getTag(): String = js.native
    
    /**
      * Determines whether the map is flagged to use the quadkey as its
      * map cache name.
      * @returns {boolean} Whether or not the map has been flagged to
      * use the quadkey as its map cache name.
      */
    def getUseQuadKeyForMapCacheName(): Boolean = js.native
    
    /**
      * Gets the REST service version.
      * @returns {string} The REST service version.
      */
    def getVersion(): String = js.native
    
    /**
      * Sets the map image background color.
      * @param {number} a Alpha level.
      * @param {number} r Red level.
      * @param {number} g Green level.
      * @param {number} b Blue level.
      */
    def setBackgroundColor(a: Double, r: Double, g: Double, b: Double): Unit = js.native
    
    /**
      * Sets the bleed ratio. Bleeds greater than 1.0 will fetch content 
      * beyond the edge of the tile extents (this is useful for point 
      * features).
      * @param {number} br The desired bleed ratio, between 1.0 and 2.0.
      */
    def setBleedRatio(br: Double): Unit = js.native
    
    /**
      * Gets image type associated with this descriptor to one of 'png',
      * 'png8', or 'jpg'.
      * @param {string} t The image type associated which should be
      * associated with this descriptor.
      */
    def setImageType(t: String): Unit = js.native
    
    /**
      * Sets a layer's fill color.
      * @param {string} layerId The MapDotNet map layer ID.
      * @param {number} a Alpha level.
      * @param {number} r Red level.
      * @param {number} g Green level.
      * @param {number} b Blue level.
      */
    def setLayerFill(layerId: String, a: Double, r: Double, g: Double, b: Double): Unit = js.native
    
    /**
      * Sets a layer's fill color as a SQL expression.
      * @param {string} layerId The MapDotNet map layer ID.
      * @param {string} exp The SQL expression to select a row's fill color.
      */
    def setLayerFillAsExpression(layerId: String, exp: String): Unit = js.native
    
    /**
      * Sets a layer's outline color and thickness.
      * @param {string} layerId The MapDotNet map layer ID.
      * @param {number} a Alpha level.
      * @param {number} r Red level.
      * @param {number} g Green level.
      * @param {number} b Blue level.
      * @param {number} thk Outline thickness in pixels.
      */
    def setLayerOutline(layerId: String, a: Double, r: Double, g: Double, b: Double, thk: Double): Unit = js.native
    
    /**
      * Sets a layer's visibility.
      * @param {string} layerId The MapDotNet map layer ID.
      * @param {boolean} isVisible Whether or not the layer should be visible.
      */
    def setLayerVisibility(layerId: String, isVisible: Boolean): Unit = js.native
    
    /**
      * Add or replace the where clause for a layer. The where clause
      * is a SQL expression used to filter rows.
      * @param {string} layerId The MapDotNet map layer ID.
      * @param {string} where The desired SQL where expression.
      * @param {boolean} [merge] Whether to merge the new where clause
      * with the existing where clause using a SQL AND or to replace
      * the existing where clause with the new one. Defaults to true (merge).
      */
    def setLayerWhere(layerId: String, where: String, merge: Boolean): Unit = js.native
    
    /**
      * Sets a separator character for the layer where clause expression
      * in the query string. This is set to ',' by default, which is 
      * consistent with SQL.
      * @param {string} sep The desired seperator, which should be a 
      * single character.
      */
    def setLayerWhereSep(sep: String): Unit = js.native
    
    /**
      * Sets the optional map cache name.
      * @param {string} mcn The desired map cache name.
      */
    def setMapCacheName(mcn: String): Unit = js.native
    
    /**
      * Gets the map's cache setting to one of 'None', 
      * 'ReadOnly', 'ReadWrite', 'ForceWrite', and 'Default.'
      * @param {string} mco The desired cache setting for the map.
      */
    def setMapCacheOption(mco: String): Unit = js.native
    
    /**
      * Sets the flag to suspend descriptor change notifications. If 
      * set true, all changes to this descriptor will not cause the map
      * to redraw. Setting to false will enable redraws and immediately
      * force a redraw.
      * @param {boolean} flag Whether or not descriptor change notifications
      * should be enabled.
      */
    def setSuspendDescriptorChangeNotifications(flag: Boolean): Unit = js.native
    
    /**
      * Sets the map's tag, which is used modify request URIs to avoid 
      * browser caching.
      * @param {string} tag The desired tag.
      */
    def setTag(tag: String): Unit = js.native
    
    /**
      * Sets the flag that uses the quadkey as its map cache name.
      * @param {boolean} flag Whether or not the map should be flagged
      * to use the quadkey as its map cache name.
      */
    def setUseQuadKeyForMapCacheName(flag: Boolean): Unit = js.native
    
    /**
      * Sets the REST service version.
      * @param {string} v The version number.
      */
    def setVersion(v: String): Unit = js.native
  }
  
  @JSImport("mapsjs", "tile.layer")
  @js.native
  class layer protected () extends StObject {
    def this(id: String) = this()
    def this(id: String, useBackdrop: Boolean) = this()
    def this(id: String, useBackdrop: Boolean, maxConcurrentRequests: Double) = this()
    def this(id: String, useBackdrop: Unit, maxConcurrentRequests: Double) = this()
    
    /**
      * Composes an array of quadtiles with composition information and
      * requestor endpoints. This can be used to create static images
      * or print-ready versions of this tile layer at arbitrary extents
      * (both source and target) For example: If you needed a 5x3 inch 
      * 300 dpi output you can specify extents in device units to be
      * 1500x900. This function determines the correct zoom level so 
      * that the source extents fits in the target extents to the
      * nearest integer zoom level.
      * @param {envelope} extentsMapUnits Source extents in map units.
      * @param {envelope} extentsDeviceUnits Target extents in pixels.
      * @returns {object} Composed object in the form 
      * {quadCollection, endpointCollection, idxMinX, idxMinY, ulX, ulY }
      * where quadCollection is an array of quad objects, endpointCollection
      * is an array of REST endpoints from which to obtain the tiled content,
      * idxMinX and idxMinY are the minimum x and y tile indicies of the
      * collection respectively, and ulX and ulY are the offset in pixels
      * of the upper left tile from the upper left target extents.
      */
    def compose(extentsMapUnits: envelope, extentsDeviceUnits: envelope): EndpointCollection = js.native
    
    /**
      * Unbind all associations with this tile layer to facilitate garbage collection
      */
    def dispose(): Unit = js.native
    
    /**
      * Returns the tile layer's descriptor, which describes how 
      * requested content is rendered or styled.
      * @returns {object} The tile layer's descriptor.
      */
    def getDescriptor(): js.Any = js.native
    
    /**
      * @param {number} m - number for margin in pixels
      */
    // setContentExtentsMarginInPixels(m: number): void;
    /**
      * Gets ID associated with this tile layer.
      * @returns {string} ID of the layer.
      */
    def getId(): String = js.native
    
    /**
      * Gets the visibility state of this tile layer.
      * @returns {boolean} Whether or not this layer is visible.
      */
    def getIsVisible(): Boolean = js.native
    
    /**
      * Gets maximum zoom level where this tile layer is visible.
      * @returns {number} The maximum zoom level.
      */
    def getMaxZoomLevel(): Double = js.native
    
    /**
      * Gets minimum zoom level where this tile layer is visible.
      * @returns {number} The minimum zoom level.
      */
    def getMinZoomLevel(): Double = js.native
    
    /**
      * Gets the opacity of this tile layer.
      * @returns {number} Opacity as a decimal.
      */
    def getOpacity(): Double = js.native
    
    /**
      * Returns this tile layer's renderer if it exists, which defines 
      * how geometry data for a quadView is rendered.
      * @returns {renderer} The renderer object.
      */
    def getRenderer(): renderer = js.native
    
    /**
      * Returns this tile layer's requestor which defines what kind of 
      * content to get and where to get it.
      * @returns {requestor} This tile layer's requestor.
      */
    def getRequestor(): requestor = js.native
    
    /**
      * Determines whether this tile layer uses a backdrop.
      * @returns {boolean} Whether or not the layer uses a backdrop.
      */
    def getUseBackdrop(): Boolean = js.native
    
    /**
      * Notifies the tile layer to check for changes to its descriptor.
      */
    def notifyDescriptorChange(): Unit = js.native
    
    /**
      * Notifies the tile layer to check for changes to its renderer.
      */
    def notifyRendererChange(): Unit = js.native
    
    /**
      * Instructs the tile loader to populate a specified tile pyramid.
      * This is used to fetch content (e.g. bitmap tiles) and preload 
      * it into the browser cache.
      * @param {envelope} extents Envelope for which to fetch content.
      * @param {number} startZoomLevel Minimum zoom level for which to
      * fetch content.
      * @param {number} endZoomLevel Maximum zoom level for which to 
      * fetch content.
      */
    def preload(extents: envelope, startZoomLevel: Double, endZoomLevel: Double): Unit = js.native
    
    /**
      * Sets the tile layer's descriptor, which describes how requested
      * content is rendered or styled.
      * @param {function} d A descriptor for this tile layer.
      */
    def setDescriptor(d: js.Any): Unit = js.native
    
    /**
      * Enables or disables the fade in on tile content, which defaults to enabled.
      * @param {boolean} fadeIn Whether or not fade in on tile content 
      * should be enabled.
      */
    def setEnableTileFadeIn(fadeIn: Boolean): Unit = js.native
    
    /**
      * Sets visibility state of this tile layer.
      * @param {boolean} v Whether this layer should be visible or not.
      */
    def setIsVisible(v: Boolean): Unit = js.native
    
    /**
      * Sets maximum zoom level where this tile layer is visible.
      * @param {number} maxZ The desired maximum zoom level.
      */
    def setMaxZoomLevel(maxZ: Double): Unit = js.native
    
    /** 
      * Sets minimum zoom level where this tile layer is visible.
      * @param {number} minZ The desired minimum zoom level.
      */
    def setMinZoomLevel(minZ: Double): Unit = js.native
    
    /**
      * Sets the default action to take on error.
      * @param {function} action Function to execute on error.
      */
    def setNotifyErrorAction(action: js.Function0[Unit]): Unit = js.native
    
    /** 
      * Sets an optional function to be called when the tile loading
      * queue for this layer has emptied.
      * @param {function} action Callback function.
      */
    def setNotifyLoadingQueueHasEmptiedAction(action: js.Function0[Unit]): Unit = js.native
    
    /**
      * Sets the optional function to be called by this layer's tile 
      * loader during processing. The supplied progress function takes 
      * tiles loaded and tiles total parameters.
      * @param {function} action Callback of the signature action(tileLoaded, tilesTotal).
      */
    def setNotifyLoadingQueueProgressAction(action: js.Function2[/* tilesLoaded */ Double, /* tilesTotal */ Double, Unit]): Unit = js.native
    
    /** 
      * Sets opacity of this tile layer.
      * @param {number} o Opacity as a decimal.
      */
    def setOpacity(o: Double): Unit = js.native
    
    /**
      * Sets optional renderer which defines how geometry data for 
      * quadView is rendered.
      * @param {renderer} r The renderer delegate function with 
      * signature renderer(quadview).
      */
    def setRenderer(r: js.Any): Unit = js.native
    
    /**
      * Sets optional request processor for this tile layer. This is 
      * an advanced feature allowing developers to tap into tile 
      * request pipeline for purposes of customizing requests or manage 
      * custom caching. This is also the mechanism used for offline 
      * apps with frameworks such as phonegap.
      * @param {function} Processor function with signature
      * processor(requestor, descriptor, quad, timeoutMs, complete, error)
      */
    def setRequestProcessor(
      processorFunc: js.Function6[
          /* requestor */ requestor, 
          /* descriptor */ js.Any, 
          /* quad */ quad, 
          /* timeoutMs */ Double, 
          /* completeAction */ js.Function1[/* img */ HTMLElement, Unit], 
          /* errorAction */ js.Function1[/* msg */ String, Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Sets this tile layer's requestor, which defines what kind of
      * content to get and where to get it.
      * @param {tile.requestor} req A requestor object.
      * @param {tile.requestor} [desc] Descriptor object so that both
      * can be set in one call and incur only one content change event.
      */             
    def setRequestor(req: requestor): Unit = js.native
    def setRequestor(req: requestor, desc: js.Any): Unit = js.native
    
    /**
      * Sets whether or not to retain and display previous level tile 
      * content as you change tile levels to provide a nice zoom level 
      * change effect. Once the next level is loaded the old level 
      * content is always discarded. This should be set to false if there 
      * is translucent content to display. Defaults to true (prior to 
      * version 9.0.0001 this value had the same state as useBackdrop.)
      * @param {boolean} ret Whether or not to retain interlevel content.
      */
    def setRetainInterlevelContent(retain: Boolean): Unit = js.native
    
    /**
      * Sets pixel bleed on quadTiles, which defaults to 1. Setting this 
      * to zero for overlay layers with translucent polygon fills is 
      * recommended. Bleed overlap can create faint lines at tile 
      * boundries when fill is not opaque.
      * @param {number} bleed The number of pixels to bleed.
      */
    def setTileBleedPix(bleed: Double): Unit = js.native
  }
  
  @JSImport("mapsjs", "tile.layerOptions")
  @js.native
  class layerOptions protected () extends StObject {
    def this(id: String, options: Descriptor) = this()
    
    /**
      * Gets ID associated with the underlying tile layer.
      * @returns {string} ID of the layer.
      */
    def getId(): String = js.native
    
    /**
      * Gets this layerOptions object as a JavaScript object.
      */
    def getOptions(): js.Any = js.native
    
    /**
      * Returns the underlying tile layer.
      * @returns {layer} The underlying tile layer.
      */
    def getTileLayer(): layer = js.native
  }
  
  @JSImport("mapsjs", "tile.quad")
  @js.native
  class quad () extends StObject {
    
    /** 
      * Compares this quad tile with another quad tile and determines
      * whether or not they are equal.
      * @param {quad} Quad tile with which to check for equality with this quad tile.
      * @returns {boolean} Result of the equality test.
      */
    def equals(q: quad): Boolean = js.native
    
    /**
      * Generates the quad tile which is a given number of levels above
      * this tile in the pyramid and in which this quad tile is contained.
      * @param {number} ancestorsBack Number of levels above this tile the
      * generated tile should be.
      * @returns {quad} The generated parent tile.
      */
    def factoryParent(ancestorsBack: Double): quad = js.native
    
    /**
      * Gets the envelope in map units which encompasses this quad tile.
      * @returns {envelope} The encompassing envelope of this quad tile.
      */
    def getEnvelope(): envelope = js.native
    
    /**
      * Gets the quad key for this quad tile as a string.
      * @returns {string} Quad key for this quad tile as a string.
      */
    def getKey(): String = js.native
    
    /**
      * Gets the z coordinate of this quad tile, or depth.
      * @returns {number} The z coordinate of this quad tile.
      */
    def getLevel(): Double = js.native
    
    /**
      * Gets the x coodinate of this quad tile.
      * @returns {number} The x coordinate of this quad tile.
      */
    def getX(): Double = js.native
    
    /** 
      * Gets the y coordinate of this quad tile.
      * @returns {number} The y coordinate of this quad tile.
      */
    def getY(): Double = js.native
  }
  object quad {
    
    @JSImport("mapsjs", "tile.quad")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def factoryQuadFromKey(key: String): quad = ^.asInstanceOf[js.Dynamic].applyDynamic("factoryQuadFromKey")(key.asInstanceOf[js.Any]).asInstanceOf[quad]
  }
  
  @JSImport("mapsjs", "tile.renderer")
  @js.native
  class renderer () extends StObject {
    def this(options: RenderBitmap) = this()
    
    /**
      * Sets the render bitmap function which takes a bitmap image and
      * a canvas context and renders the image to the canvas context.
      * @param {function} func Function with the signature 
      * func(img, context, contextSize, bleed) where img is the bitmap
      * image to render, context is the canvas context on which to 
      * render the image, contextSize is the size of the canvas context
      * in pixels and bleed is the margin around each tile to bleed.
      */
    def setRenderBitmap(
      func: js.Function4[
          /* img */ HTMLElement, 
          /* context */ CanvasRenderingContext2D, 
          /* contextSize */ Double, 
          /* bleed */ Double, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Sets render geometry function which takes a geometry and canvas 
      * context and renders the geometry to the canvas context. The 
      * geometries passed in are transformed to pixel units and offset 
      * to the context origin.
      * @param {function} func Function with signature func(shape, context)
      * where shape is the geometry to render and context is the canvas
      * context on which to render.
      */
    def setRenderGeometry(func: js.Function2[/* shape */ geometry, /* context */ CanvasRenderingContext2D, Unit]): Unit = js.native
    
    /**
      * Sets the render point function which takes a point and canvas 
      * context and renders the point to the canvas. The points passed 
      * in are transformed to pixel units and offset to context origin.
      * @param {function} func Function of the form func(shape, context)
      * where shape is the point object to be rendered and context is the 
      * canvas context on which to render.
      */
    def setRenderPoint(func: js.Function2[/* pt */ point, /* context */ CanvasRenderingContext2D, Unit]): Unit = js.native
  }
  
  @JSImport("mapsjs", "tile.rendererDensityMap")
  @js.native
  class rendererDensityMap () extends StObject {
    
    /**
      * Tells renderer to re-render density map and recompute ranges. 
      * This should be called if the data changes or if, due to extent
      * changes, the density changes.
      */
    def notifyRecompute(): Unit = js.native
    def notifyRecompute(extents: envelope): Unit = js.native
    
    /**
      * Sets the bleed ratio, which is the sets the percentage of the
      * margin around each tile to use in the tile's computation. Note:
      * some bleed (i.e., greater than 1) is required since a heat map
      * relies on adjacent data.
      * @param {number} bleed The desired bleed ratio.
      */
    def setBleed(bleed: Double): Unit = js.native
    
    /**
      * Sets color ranges from cold to hot for the renderer.
      * @param {number[][]} matrix Array of arrrays of numbers, each
      * of the form [r,g,b,a], where each array represents a color and
      * colors range from cold to hot. Note: Typically, a dozen colors
      * is sufficient.
      */
    def setColorMatrix(matrix: js.Array[js.Array[Double]]): Unit = js.native
    
    /**
      * Sets filter radius corresponding to standard deviations. The
      * filter radius is the cutoff point at which adjacent cells no
      * longer contribute to a cell's calculation.
      * @param {number} filterStdDevRadius Number of standard deviations
      * from the mean of a normal distribution to which to give positive 
      * weight.
      */
    def setFilterStdDevRadius(filterStdDevRadius: Double): Unit = js.native
    
    /**
      * Sets the number of rows and columns of cells to be used for 
      * computation within the grid.
      * @param {number} gridSize Number of rows and columns used in
      * the grid.
      */
    def setGridSize(gridSize: Double): Unit = js.native
    
    /**
      * Sets the minimum required cell value for a cell to receive 
      * a color. Default minimum value is 0.
      * @param {number} mcv The minimum cell value for painting.
      */
    def setMinCellValue(min: Double): Unit = js.native
    
    /**
      * Sets an optional action to perform on each row. This enables 
      * processing the values on one or more columns for each row for
      * use in the density map computations.
      * @param {action} ra Function to call on each row with signature
      * action(row). The value returned from the function will is added
      * to the cell's value.
      */
    def setRowAction(action: js.Function1[/* row */ js.Any, Double]): Unit = js.native
  }
  
  @JSImport("mapsjs", "tile.requestor")
  @js.native
  class requestor () extends StObject {
    
    /**
      * Returns whether or not caching is enabled for vector-based 
      * requestors. 
      * @returns {boolean} Whether or not caching is enabled.
      */
    def getCacheEnabled(): Boolean = js.native
    
    /**
      * Gets format of data returned by REST service.
      * @returns {string} Data format returned by the REST service.
      */
    def getDataFormat(): String = js.native
    
    /**
      * Gets formatted endpoint using the supplied quadtile and a descriptor.
      * @param {quad} quad Quadtile for which to fetch the endpoint.
      * @returns {string} The requested URI string.
      */
    def getFormattedEndpoint(quad: quad, descriptor: js.Any): String = js.native
    
    /**
      * Determines whether or not this requestor returns bitmap images.
      * @returns {boolean} Whether or not this requestor returns bitmap
      * images.
      */
    def getIsRestImage(): Boolean = js.native
    
    /** ???
      * Gets the additional 
      * @returns {object[]}
      */
    def getKeyVals(): js.Array[js.Object] = js.native
    
    /**
      * Gets data locally if the requestor supports it.
      * @param {quad} quad Quadtile for which to fetch the endpoint.
      * @returns {string} The requested JSON data.
      */
    def getLocalData(quad: quad, descriptor: js.Any): String = js.native
    
    /**
      * Gets maximum available zoom level content that can be retrieved 
      * from the endpoint this requestor consumes.
      * @returns {number} The maximum available zoom level for this requestor.
      */
    def getMaxAvailableZoomLevel(): Double = js.native
    
    /**
      * Gets requestor timeout in miliseconds.
      * @returns {number} Requestor timeout in miliseconds.
      */
    def getTimeoutMs(): Double = js.native
    
    /**
      * Determines whether or not this requestor uses an endpoint 
      * rather than local data.
      * @returns {boolean} Whether or not this requestor gets data from
      * an endpoint.
      */
    def getUsesEndpoint(): Boolean = js.native
    
    /**
      * Creates unique sha1 hash from this requestor and the supplied
      * descriptor. This is useful in creating a unique key or folder 
      * for tile caching. This combined with a tile's quad-key can 
      * efficiently and uniquely identify a particular tile.
      * @params {descriptor} The descriptor for which to create the hash.
      * @returns {string} The generated sha1 hash.
      */
    def hash(descriptor: js.Any): String = js.native
    
    /**
      * Sets whether or not caching is enabled for vector-beased requestors. 
      * @param {boolean} flagce - true (default) if caching is enabled
      */
    def setCacheEnabled(flag: Boolean): Unit = js.native
    
    /**
      * Sets format of data that should be returned by REST service.
      * @param {string} df Name of the data format the REST service 
      * should use.
      */
    def setDataFormat(df: String): Unit = js.native
    
    /**
      * Sets whether this requestor should return bitmap images.
      * @param {boolean} flag Whether or not this requestor should return
      * bitmap images.
      */
    def setIsRestImage(flag: Boolean): Unit = js.native
    
    /** Set any key/value pairs that are attached to the ajax call (such as username and password)
      */
    def setKeyVals(options: js.Array[js.Object]): Unit = js.native
    
    /**
      * Sets maximum available zoom level content that can be retrieved
      * from the endpoint this requestor consumes. Note: This defaults
      * to the projection's maximum available zoom level, which is 20
      * in spherical mercator.
      * @param {number} max The maximum available zoom level for this requestor.
      */
    def setMaxAvailableZoomLevel(max: Double): Unit = js.native
    
    /**
      * Sets requestor timeout in miliseconds.
      * @param {number} ms Desired requestor timeout in miliseconds.
      */
    def setTimeoutMs(ms: Double): Unit = js.native
    
    /**
      * Sets whether or not this requestor uses an endpoint rather than
      * local data.
      * @param {boolean} Whether or not this requestor should get data
      * from an endpoint.
      */
    def setUsesEndpoint(flag: Boolean): Unit = js.native
  }
  
  @JSImport("mapsjs", "tile.requestorBing")
  @js.native
  class requestorBing () extends requestor {
    def this(options: DataFormat) = this()
    
    /**
      * Gets the Bing key associated with this requestor.
      * @returns {string} The Bing key for this requestor.
      */
    def getBingKey(): String = js.native
    
    /**
      * Gets the formatted endpoint uri for Bing maps, e.g. 
      * ecn.t{0}.tiles.virtualearth.net/tiles/{1}{2}{3}?g={4}&mkt={5}&shading=hill.
      * @returns {string} endpoint to Bing tile server as a formatted string
      */
    def getEndpoint(): String = js.native
    
    /**
      * Gets Bing tile generation
      * @returns {string} the tile generation as an integer
      */
    def getGeneration(): String = js.native
    
    /**
      * Gets the language code for which the tiles are rendered. The
      * default code is 'en-US'.
      * @returns {string} The language code for which tiles are rendered.
      */
    def getMarket(): String = js.native
    
    /**
      * Gets the protocol for the endpoint, either 'http' or 'https'.
      * @returns {string} The endpoint protocol.
      */
    def getScheme(): String = js.native
    
    /**
      * Sets Bing key which then calls Microsoft metadata service and
      * automatically configures content endpoint.
      * @param {string} key Bing key.
      */
    def setBingKey(key: String): Unit = js.native
    
    /**
      * Sets Bing tile generation
      * @param {string} g - generation as an integer
      */
    def setGeneration(g: String): Unit = js.native
    
    /**
      * Sets language code for which to render tiles. For example,
      * 'en-US'.
      * @param {string} m Language code for which to render tiles.
      */
    def setMarket(m: String): Unit = js.native
    
    /**
      * Sets endpoint protocol to either 'http' or 'https'.
      * @param {string} s Protocol to use in endpoints.
      */
    def setScheme(s: String): Unit = js.native
  }
  
  @JSImport("mapsjs", "tile.requestorLocal")
  @js.native
  class requestorLocal () extends requestor {
    def this(options: Data) = this()
    
    /** 
      * Returns your source data parsed into theformat { Shapes: [],
      * Values: [], Bounds: [] } This may be useful for doing client-side 
      * queries on the local data where all of the WKT has been parsed 
      * into points and geometry. There is also a bounds collection to 
      * do a quick spatial check for complex polygons.
      * @returns {object} Parsed data object in the form {Shapes, Values, Bounds}.
      */
    def getParsedData(): Bounds = js.native
    
    /** 
      * Gets the unparsed source data.
      * @returns {object} Array of source data objects.
      */
    def getSource(): js.Array[js.Object] = js.native
    
    /**
      * Sets source data.
      * @param {object} data An array of JavaScript objects to use as
      * the requestor source data.
      */
    def setSource(data: js.Array[js.Object]): Unit = js.native
  }
  
  @JSImport("mapsjs", "tile.requestorMDNRest")
  @js.native
  class requestorMDNRest protected () extends requestor {
    def this(endpoint: String) = this()
    def this(endpoint: String, options: DataFormat) = this()
    
    /**
      * Gets uri endpoint for the MapDotNet REST service.
      * @returns {string} Uri endpoint for the MapDotNet REST service.
      */
    def getEndpoint(): String = js.native
  }
  
  @JSImport("mapsjs", "tile.requestorOpen")
  @js.native
  class requestorOpen protected () extends requestor {
    def this(endpoint: String, subdomains: js.Array[String]) = this()
    def this(endpoint: String, subdomains: js.Array[String], options: DataFormat) = this()
  }
}
