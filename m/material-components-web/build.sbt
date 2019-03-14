organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-66f536"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-447879",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-984480",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-112553",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-3e064f",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-3ff249",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190313Z-9cced9",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-738923",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-17cf3d",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-ea91ca",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-a4ad9d",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-7bef9b",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-d1dd77",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-87d089",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-0f1c49",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-7781dc",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-63024d",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-01a541",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-06cb9c",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-40ec12",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-ad72f7",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-f3f29e",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-8e4b8e",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-f2cf21",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-e810de",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-007fa6",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-f19fbb",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        