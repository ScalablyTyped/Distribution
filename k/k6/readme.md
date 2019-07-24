
# Scala.js typings for k6

Typings are for version 0.24

## Library description:
Dummy package for autocompleting k6 scripts.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | k6 |
| Keywords           | - |
| # releases         | 3 |
| # dependents       | 0 |
| # downloads        | 6752 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/loadimpact/k6#readme)
- [Bugs](https://github.com/loadimpact/k6/issues)
- [Repository](https://github.com/loadimpact/k6)
- [Npm](https://www.npmjs.com/package/k6)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/*
 * Cryptography utilities.
 * https://docs.k6.io/docs/k6crypto
 */

/*
 * Encoding utilities.
 * https://docs.k6.io/docs/k6encoding
 */

/**
 * Base64 encode a string.
 * https://docs.k6.io/docs/b64encode-input-encoding
 * @param input - String to encode.
 * @param encoding - Base64 variant.
 * @returns Base64 encoded string.
 * @public
 */
/*
 * Custom entities exposed in the global environment.
 *
 * The global environment changes with execution context. Some items are
 * available only in the init context, others only during VU logic execution,
 * others in both contexts. Comments note availability.
 */

/*
 * HTML parsing and access.
 * https://docs.k6.io/docs/k6html
 */

// === Main ===
// ------------
/**
 * Parse an HTML string.
 * @param html - HTML source.
 * @returns Document node object.
 * @public
 */
/*
 * HTTP client.
 * https://docs.k6.io/docs/k6http
 */

// Type definitions for k6 0.24
// Project: https://docs.k6.io/docs
// Definitions by: MajorBreakfast <https://github.com/MajorBreakfast>
//                 Book Moons <https://github.com/bookmoons>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 3.4
/**
 * k6 JavaScript API.
 * https://docs.k6.io/docs
 *
 * @privateRemarks
 * Uses a branding pattern throughout to reflect the custom classes exposed by
 * the k6 runtime. These classes have internal state not visible in JavaScript.
 * The object passed back to k6 must be an actual instance created on the
 * golang side. Duck typed objects are not safe.
 *
 * Each class includes a protected property __brand: never. The brand breaks
 * duck typing for noninstances with an identical public shape.
 *
 * This follows the pattern used in the TypeScript compiler:
 * https://github.com/Microsoft/TypeScript/blob/7b48a182c05ea4dea81bab73ecbbe9e013a79e99/src/compiler/types.ts#L693-L698
 *
 * @packageDocumentation
 */

/*
 * Custom metrics.
 * https://docs.k6.io/docs/k6metrics
 */

/**
 * Custom metric.
 * @public
 */
/*
 * Program options.
 * https://docs.k6.io/docs/options
 */

/*
 * WebSocket client.
 * https://docs.k6.io/docs/k6-websocket-api
 */

/**
 * Open WebSocket connection.
 * https://docs.k6.io/docs/connect-url-params-func
 * @param url - Request URL.
 * @param callback - Logic to execute with socket.
 * @returns HTTP response to connection request.
 * @public
 */

```

