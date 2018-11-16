package typings
package heredatalensLib.HNs.datalensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * HERE Maps API and Data Lens JavaScript API can be used to visualize data from different network sources.
     * For each network source type, a service class is required. The service also stores API connection credentials.
     * The service instance must be configured with a service.Platform instance.
     */
@JSGlobal("H.datalens.Service")
@js.native
class Service ()
  extends heremapsLib.HNs.serviceNs.IConfigurable {
  /**
           * Constructor
           * @param options - Overrides the configuration from the service.Platform instance
           */
  def this(options: heredatalensLib.HNs.datalensNs.ServiceNs.Options) = this()
  /**
           * This method fetches a layer of geometries (eg buildings or administrative boundaries).
           * @param layerName - The name of the layer
           * @param params - URL parameters (eg bounding box)
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def fetchLayer(layerName: java.lang.String): stdLib.Promise[_] = js.native
  /**
           * This method fetches a layer of geometries (eg buildings or administrative boundaries).
           * @param layerName - The name of the layer
           * @param params - URL parameters (eg bounding box)
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def fetchLayer(layerName: java.lang.String, params: js.Any): stdLib.Promise[_] = js.native
  /**
           * This method fetches a layer of geometries (eg buildings or administrative boundaries).
           * @param layerName - The name of the layer
           * @param params - URL parameters (eg bounding box)
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def fetchLayer(
    layerName: java.lang.String,
    params: js.Any,
    onResult: js.Function1[/* result */ js.Any, scala.Unit]
  ): stdLib.Promise[_] = js.native
  /**
           * This method fetches a layer of geometries (eg buildings or administrative boundaries).
           * @param layerName - The name of the layer
           * @param params - URL parameters (eg bounding box)
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def fetchLayer(
    layerName: java.lang.String,
    params: js.Any,
    onResult: js.Function1[/* result */ js.Any, scala.Unit],
    onError: js.Function1[/* error */ js.Any, scala.Unit]
  ): stdLib.Promise[_] = js.native
  /**
           * This method fetches vector tile data from the layer.
           * @param x - Tile columns
           * @param y - Tile row
           * @param z - zoom level
           * @param params - URL parameters (eg bounding box)
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Typed array with tile data
           */
  def fetchLayerTile(
    layerName: java.lang.String,
    x: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.X,
    y: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Y,
    z: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom
  ): stdLib.Promise[stdLib.Uint8Array] = js.native
  /**
           * This method fetches vector tile data from the layer.
           * @param x - Tile columns
           * @param y - Tile row
           * @param z - zoom level
           * @param params - URL parameters (eg bounding box)
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Typed array with tile data
           */
  def fetchLayerTile(
    layerName: java.lang.String,
    x: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.X,
    y: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Y,
    z: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom,
    params: js.Any
  ): stdLib.Promise[stdLib.Uint8Array] = js.native
  /**
           * This method fetches vector tile data from the layer.
           * @param x - Tile columns
           * @param y - Tile row
           * @param z - zoom level
           * @param params - URL parameters (eg bounding box)
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Typed array with tile data
           */
  def fetchLayerTile(
    layerName: java.lang.String,
    x: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.X,
    y: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Y,
    z: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom,
    params: js.Any,
    onResult: js.Function1[/* result */ js.Any, scala.Unit]
  ): stdLib.Promise[stdLib.Uint8Array] = js.native
  /**
           * This method fetches vector tile data from the layer.
           * @param x - Tile columns
           * @param y - Tile row
           * @param z - zoom level
           * @param params - URL parameters (eg bounding box)
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Typed array with tile data
           */
  def fetchLayerTile(
    layerName: java.lang.String,
    x: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.X,
    y: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Y,
    z: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom,
    params: js.Any,
    onResult: js.Function1[/* result */ js.Any, scala.Unit],
    onError: js.Function1[/* error */ js.Any, scala.Unit]
  ): stdLib.Promise[stdLib.Uint8Array] = js.native
  /**
           * This method fetches query data for a given query ID.
           * This method can be used when implementing a custom provider.
           * Otherwise existing providers are used to get data from the Data Lens REST API.
           * @param queryId - The ID of the Data Lens REST API query
           * @param params - Query dynamic parameters
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def fetchQueryData(queryId: java.lang.String): stdLib.Promise[_] = js.native
  /**
           * This method fetches query data for a given query ID.
           * This method can be used when implementing a custom provider.
           * Otherwise existing providers are used to get data from the Data Lens REST API.
           * @param queryId - The ID of the Data Lens REST API query
           * @param params - Query dynamic parameters
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def fetchQueryData(queryId: java.lang.String, params: js.Any): stdLib.Promise[_] = js.native
  /**
           * This method fetches query data for a given query ID.
           * This method can be used when implementing a custom provider.
           * Otherwise existing providers are used to get data from the Data Lens REST API.
           * @param queryId - The ID of the Data Lens REST API query
           * @param params - Query dynamic parameters
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def fetchQueryData(queryId: java.lang.String, params: js.Any, onResult: js.Function1[/* result */ js.Any, scala.Unit]): stdLib.Promise[_] = js.native
  /**
           * This method fetches query data for a given query ID.
           * This method can be used when implementing a custom provider.
           * Otherwise existing providers are used to get data from the Data Lens REST API.
           * @param queryId - The ID of the Data Lens REST API query
           * @param params - Query dynamic parameters
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def fetchQueryData(
    queryId: java.lang.String,
    params: js.Any,
    onResult: js.Function1[/* result */ js.Any, scala.Unit],
    onError: js.Function1[/* error */ js.Any, scala.Unit]
  ): stdLib.Promise[_] = js.native
  /**
           * This method fetches statistical data for the Data Lens query (eg minimum and maximum values for the query metric).
           * It can be used to define visualization boundaries, scales and legends.
           * @param queryId - The ID of the Data Lens REST API query
           * @param statsQuery - A JSON object which defines a statistics query for the Data Lens query
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def fetchQueryStats(queryId: java.lang.String, statsQuery: js.Any): stdLib.Promise[_] = js.native
  /**
           * This method fetches statistical data for the Data Lens query (eg minimum and maximum values for the query metric).
           * It can be used to define visualization boundaries, scales and legends.
           * @param queryId - The ID of the Data Lens REST API query
           * @param statsQuery - A JSON object which defines a statistics query for the Data Lens query
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def fetchQueryStats(
    queryId: java.lang.String,
    statsQuery: js.Any,
    onResult: js.Function1[/* result */ js.Any, scala.Unit]
  ): stdLib.Promise[_] = js.native
  /**
           * This method fetches statistical data for the Data Lens query (eg minimum and maximum values for the query metric).
           * It can be used to define visualization boundaries, scales and legends.
           * @param queryId - The ID of the Data Lens REST API query
           * @param statsQuery - A JSON object which defines a statistics query for the Data Lens query
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def fetchQueryStats(
    queryId: java.lang.String,
    statsQuery: js.Any,
    onResult: js.Function1[/* result */ js.Any, scala.Unit],
    onError: js.Function1[/* error */ js.Any, scala.Unit]
  ): stdLib.Promise[_] = js.native
  /**
           * This method makes an HTTP request to the Data Lens REST API.
           * It makes any CRUD request (GET, PUT, POST, DELETE).
           * This method can be used when implementing a custom provider or implementing data management.
           * Otherwise existing providers are used to get data from the Data Lens REST API.
           * @param method - Any HTTP method (GET, PUT, POST, etc.)
           * @param endpoint - The REST API endpoint
           * @param params - URL parameters
           * @param body - The payload of the request
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def request(method: java.lang.String, endpoint: java.lang.String): stdLib.Promise[_] = js.native
  /**
           * This method makes an HTTP request to the Data Lens REST API.
           * It makes any CRUD request (GET, PUT, POST, DELETE).
           * This method can be used when implementing a custom provider or implementing data management.
           * Otherwise existing providers are used to get data from the Data Lens REST API.
           * @param method - Any HTTP method (GET, PUT, POST, etc.)
           * @param endpoint - The REST API endpoint
           * @param params - URL parameters
           * @param body - The payload of the request
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def request(method: java.lang.String, endpoint: java.lang.String, params: js.Any): stdLib.Promise[_] = js.native
  /**
           * This method makes an HTTP request to the Data Lens REST API.
           * It makes any CRUD request (GET, PUT, POST, DELETE).
           * This method can be used when implementing a custom provider or implementing data management.
           * Otherwise existing providers are used to get data from the Data Lens REST API.
           * @param method - Any HTTP method (GET, PUT, POST, etc.)
           * @param endpoint - The REST API endpoint
           * @param params - URL parameters
           * @param body - The payload of the request
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def request(method: java.lang.String, endpoint: java.lang.String, params: js.Any, body: js.Any): stdLib.Promise[_] = js.native
  /**
           * This method makes an HTTP request to the Data Lens REST API.
           * It makes any CRUD request (GET, PUT, POST, DELETE).
           * This method can be used when implementing a custom provider or implementing data management.
           * Otherwise existing providers are used to get data from the Data Lens REST API.
           * @param method - Any HTTP method (GET, PUT, POST, etc.)
           * @param endpoint - The REST API endpoint
           * @param params - URL parameters
           * @param body - The payload of the request
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def request(
    method: java.lang.String,
    endpoint: java.lang.String,
    params: js.Any,
    body: js.Any,
    onResult: js.Function1[/* result */ js.Any, scala.Unit]
  ): stdLib.Promise[_] = js.native
  /**
           * This method makes an HTTP request to the Data Lens REST API.
           * It makes any CRUD request (GET, PUT, POST, DELETE).
           * This method can be used when implementing a custom provider or implementing data management.
           * Otherwise existing providers are used to get data from the Data Lens REST API.
           * @param method - Any HTTP method (GET, PUT, POST, etc.)
           * @param endpoint - The REST API endpoint
           * @param params - URL parameters
           * @param body - The payload of the request
           * @param onResult - Callback called on a successful request with response data
           * @param onError - Callback called on an unsuccessful request with the Error object
           * @returns - Response Promise
           */
  def request(
    method: java.lang.String,
    endpoint: java.lang.String,
    params: js.Any,
    body: js.Any,
    onResult: js.Function1[/* result */ js.Any, scala.Unit],
    onError: js.Function1[/* error */ js.Any, scala.Unit]
  ): stdLib.Promise[_] = js.native
  /**
           * Sets the access and refresh tokens used to authenticate all requests against the Data Lens REST API.
           * Use this method to implement custom authentication to the Data Lens REST API.
           * @param accessToken - The token used to authenticate all requests
           * @param refreshToken - The token used to fetch a new access token after the previous access token has expired.
           * When refreshToken is provided, Service will automatically update the expired accessToken.
           */
  def setTokens(accessToken: java.lang.String, refreshToken: java.lang.String): scala.Unit = js.native
}

