
# Scala.js typings for lazy-value

Typings are for version 2.0.0

## Library description:
Create a lazily evaluated value

|                    |                 |
| ------------------ | :-------------: |
| Full name          | lazy-value |
| Keywords           | lazy, value, lazily, laziness, val, evaluation, eval, execute, getter, function, fn, memoize, cache, defer, deferred |
| # releases         | 2 |
| # dependents       | 1 |
| # downloads        | 23815 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/sindresorhus/lazy-value#readme)
- [Bugs](https://github.com/sindresorhus/lazy-value/issues)
- [Repository](https://github.com/sindresorhus/lazy-value)
- [Npm](https://www.npmjs.com/package/lazy-value)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
Create a [lazily evaluated](https://en.wikipedia.org/wiki/Lazy_evaluation) value.

@param fn - Expected to return a value.

@example
```
import lazyValue = require('lazy-value');

const value = lazyValue(() => expensiveComputation());

app.on('user-action', () => {
	doSomething(value());
});
```
*/

```

