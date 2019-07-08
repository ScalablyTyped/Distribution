organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-885155"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-ecd445",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-ce1ede",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-e29e42",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-fe4805",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-1d5f0a",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-b36f4b",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-86b4a9",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-2e6853",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-44adf4",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-b6d7b9",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-e3e2a1",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-c24c50",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-31ce7e",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-eb4f6d",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-7e8448",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-7712e6",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-070c7f",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-83ef83",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-bd0a08",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-2b7729",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-868bc7",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-61657f",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-6bd9ff",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-a820b2",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-602ca7",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        