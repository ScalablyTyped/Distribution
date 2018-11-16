```
// Type definitions for koa-views 2.x
// Project: https://github.com/queckezz/koa-views
// Definitions by: Alex Friedman <https://github.com/brooklyndev>
// Definitions: https://github.com/brooklyndev/DefinitelyTyped
// TypeScript Version: 2.3
/* =================== USAGE ===================

    import * as Koa from 'koa';
    import * as views from 'koa-views';

    const app = new Koa();
    app.use(views(__dirname + '/views', {
        map: {
            html: 'underscore'
        }
    }));

    app.use(async function (ctx, next) {
        await ctx.render('user', {
            user: 'John'
        });
    });

 =============================================== */

```